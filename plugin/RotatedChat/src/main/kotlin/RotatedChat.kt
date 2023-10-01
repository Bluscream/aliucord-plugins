package com.aliucord.plugins

import android.content.Context
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.View
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.api.SettingsAPI
import com.aliucord.entities.Plugin
import com.aliucord.fragments.SettingsPage
import com.aliucord.patcher.after
import com.aliucord.views.TextInput
import com.discord.databinding.WidgetChatListBinding
import com.discord.widgets.chat.list.WidgetChatList
import com.discord.widgets.chat.list.model.WidgetChatListModel

@Suppress("MISSING_DEPENDENCY_SUPERCLASS")
@AliucordPlugin
class RotatedChat : Plugin() {
    private val getBindingMethod = WidgetChatList::class.java
        .getDeclaredMethod("getBinding")
        .apply { isAccessible = true }

    private fun WidgetChatList.getBinding() = getBindingMethod(this) as WidgetChatListBinding

    init {
        settingsTab = SettingsTab(PluginSettings::class.java).withArgs(settings)
    }

    class PluginSettings(private val settings: SettingsAPI) : SettingsPage() {
        override fun onViewBound(view: View) {
            super.onViewBound(view)

            setActionBarTitle("Rotated Chat")

            val textInput =
                TextInput(requireContext()) // .apply { hint = "Rotation of chat in degrees" }
            textInput.editText.apply {
                maxLines = 1
                inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_FLAG_DECIMAL
                setText(settings.getFloat("degrees", 0f).toString())
                addTextChangedListener(object : TextWatcher {
                    override fun beforeTextChanged(
                        s: CharSequence,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {
                    }

                    override fun onTextChanged(
                        s: CharSequence,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {
                    }

                    override fun afterTextChanged(s: Editable) {
                        try {
                            settings.setFloat("degrees", s.toString().toFloat())
                        } catch (ignored: Throwable) {
                            settings.setFloat("degrees", 0f)
                        }
                    }
                })
            }
            addView(textInput)
        }
    }

    override fun start(context: Context) {
        patcher.after<WidgetChatList>("configureUI", WidgetChatListModel::class.java) {
            getBinding().root.rotation = settings.getFloat("degrees", 0f)
        }
    }

    override fun stop(context: Context) = patcher.unpatchAll()
}