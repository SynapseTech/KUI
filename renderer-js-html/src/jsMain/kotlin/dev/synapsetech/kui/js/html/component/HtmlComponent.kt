package dev.synapsetech.kui.js.html.component

import dev.synapsetech.kui.component.Component

open class HtmlComponent(parent: HtmlComponent?) : Component(parent) {
    override fun build(): HtmlComponentMeta {
        return HtmlComponentMeta("div")
    }
}