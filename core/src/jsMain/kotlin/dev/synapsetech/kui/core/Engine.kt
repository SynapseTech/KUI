package dev.synapsetech.kui.core

import dev.synapsetech.kui.component.Component
import dev.synapsetech.kui.component.UIDefinition
import dev.synapsetech.kui.component.components.RootComponent
import dev.synapsetech.kui.rendering.Renderer

actual class Engine {
    actual var renderer: Renderer<Component, RootComponent<Component>>? = null
    actual var uiDefinition: UIDefinition<Component>? = null

    actual suspend fun start() {
        if (renderer == null) {
            println("Renderer must not be null during runtime. Please set it to an appropriate platform renderer")
            return
        }

        // todo: runtime logic
    }
}