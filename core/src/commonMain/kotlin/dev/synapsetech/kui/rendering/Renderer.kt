package dev.synapsetech.kui.rendering

import dev.synapsetech.kui.component.Component
import dev.synapsetech.kui.component.components.RootComponent

interface Renderer<T : Component, U : RootComponent<T>> {
    fun _build(rootComponent: U) {
        if (rootComponent.parent != null) throw IllegalStateException("Root component must not have a parent component")
        build(rootComponent)
    }

    fun build(rootComponent: U)
}