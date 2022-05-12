package dev.synapsetech.kui.core

import dev.synapsetech.kui.component.Component
import dev.synapsetech.kui.component.UIDefinition
import dev.synapsetech.kui.component.components.RootComponent
import dev.synapsetech.kui.rendering.Renderer

expect class Engine {
    var renderer: Renderer<Component, RootComponent<Component>>?
    var uiDefinition: UIDefinition<Component>?

    suspend fun start()
}
