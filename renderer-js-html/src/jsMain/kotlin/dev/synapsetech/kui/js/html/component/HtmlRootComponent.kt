package dev.synapsetech.kui.js.html.component

import dev.synapsetech.kui.component.components.RootComponent

class HtmlRootComponent : RootComponent<HtmlComponent>() {
    override fun build(): HtmlComponentMeta = HtmlComponentMeta("div")
}