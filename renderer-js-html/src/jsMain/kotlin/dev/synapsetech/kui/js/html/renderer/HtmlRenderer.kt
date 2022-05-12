package dev.synapsetech.kui.js.html.renderer

import dev.synapsetech.kui.js.html.component.HtmlComponent
import dev.synapsetech.kui.js.html.component.HtmlRootComponent
import dev.synapsetech.kui.rendering.Renderer
import kotlinx.browser.document
import org.w3c.dom.Element

class HtmlRenderer(private val rootElement: Element) : Renderer<HtmlComponent, HtmlRootComponent> {
    override fun build(rootComponent: HtmlRootComponent) {
        val rootMeta = rootComponent.build()
        val element = document.createElement(rootMeta.name)
        rootElement.appendChild(element)
    }
}