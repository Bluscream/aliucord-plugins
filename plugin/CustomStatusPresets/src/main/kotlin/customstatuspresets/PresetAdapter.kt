package customstatuspresets

import CustomStatusPresets
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.aliucord.Utils
import com.discord.models.domain.emoji.Emoji
import com.discord.models.domain.emoji.ModelEmojiCustom
import com.discord.models.domain.emoji.ModelEmojiUnicode
import com.discord.stores.StoreStream
import com.discord.utilities.color.ColorCompat
import com.discord.utilities.icon.IconUtils
import com.discord.utilities.images.MGImages
import com.discord.widgets.chat.input.emoji.EmojiPickerContextType
import com.discord.widgets.chat.input.emoji.EmojiPickerListener
import com.discord.widgets.chat.input.emoji.EmojiPickerNavigator
import com.discord.widgets.user.WidgetUserSetCustomStatus
import com.discord.widgets.user.profile.UserStatusPresenceCustomView
import com.facebook.drawee.view.SimpleDraweeView
import com.lytefast.flexinput.R

@Suppress("MISSING_DEPENDENCY_SUPERCLASS")
class PresetAdapter(
    private val widgetUserSetCustomStatus: WidgetUserSetCustomStatus,
    private val presets: ArrayList<UserStatusPresenceCustomView.ViewState.WithStatus>
) : RecyclerView.Adapter<PresetViewHolder>() {
    private val statusViewId = Utils.getResId("view_user_status_presence_custom", "layout")
    private val emojiPreviewSize = Utils.getResId("custom_status_emoji_preview_size", "dimen")

    private fun savePresets() = CustomStatusPresets.mSettings.setObject("presets", presets)

    fun addPreset(preset: UserStatusPresenceCustomView.ViewState.WithStatus) = presets
        .add(preset)
        .also { if (it) savePresets() }

    private fun removePreset(preset: UserStatusPresenceCustomView.ViewState.WithStatus) =
        presets.remove(preset).also { if (it) savePresets() }

    private fun setEmoji(customEmoji: SimpleDraweeView, emoji: UserStatusPresenceCustomView.Emoji) {
        val (id, name, isAnimated) = emoji
        val ctx = customEmoji.context

        val str = if (id != null) {
            ModelEmojiCustom.getImageUri(
                id.toLong(),
                isAnimated,
                IconUtils.getMediaProxySize(ctx.resources.getDimensionPixelSize(emojiPreviewSize))
            )
        } else {
            StoreStream.getEmojis().unicodeEmojiSurrogateMap[name]?.let { modelEmojiUnicode ->
                ModelEmojiUnicode.getImageUri(modelEmojiUnicode.codePoints, ctx)
            }
        }

        MGImages.setImage(customEmoji, str)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PresetViewHolder(
        this,
        LayoutInflater
            .from(parent.context)
            .inflate(statusViewId, parent, false) as LinearLayout
    )

    @Suppress("SetTextI18n")
    override fun onBindViewHolder(holder: PresetViewHolder, position: Int) = presets[position].let {
        if (it.statusText.isEmpty()) {
            holder.customText.apply {
                text = "No Status Text"
                setTextColor(ColorCompat.getThemedColor(this, R.b.colorTextMuted))
            }
        } else {
            holder.customText.text = it.statusText
        }

        if (it.emoji != null) setEmoji(holder.customEmoji, it.emoji)
    }

    override fun getItemCount(): Int = presets.size

    fun onRemove(position: Int) = presets[position].let {
        removePreset(it)
        notifyItemRemoved(position)
    }

    fun onClick(position: Int) = presets[position].let {
        with(WidgetUserSetCustomStatus.`access$getViewModel$p`(widgetUserSetCustomStatus)) {
            clearStatusTextAndEmoji()
            if (it.statusText != null) setStatusText(it.statusText)
            val (id, name) = it.emoji ?: return@with

            setStatusEmoji(
                if (id == null) {
                    StoreStream.getEmojis().unicodeEmojiSurrogateMap[name]
                } else {
                    StoreStream.getEmojis().getCustomEmojiInternal(id.toLong())
                }
            )
        }
    }

    fun editEmoji(customEmoji: SimpleDraweeView, position: Int) = presets[position].let {
        val emojiPickerListener = EmojiPickerListener { modelEmoji: Emoji ->
            val emoji = when (modelEmoji) {
                is ModelEmojiUnicode -> UserStatusPresenceCustomView.Emoji(
                    null,
                    modelEmoji.surrogates,
                    false
                )

                is ModelEmojiCustom -> UserStatusPresenceCustomView.Emoji(
                    modelEmoji.uniqueId,
                    modelEmoji.name,
                    modelEmoji.isAnimated
                )

                else -> return@EmojiPickerListener
            }

            presets[position] = it.copy(emoji, it.statusText)
            savePresets()
            setEmoji(customEmoji, emoji)
        }

        EmojiPickerNavigator.launchBottomSheet(
            Utils.appActivity.supportFragmentManager,
            emojiPickerListener,
            EmojiPickerContextType.Global.INSTANCE,
            null
        )
    }
}