package dev.synapsetech.kui.component

import dev.synapsetech.kui.component.components.RootComponent

class UIDefinition<T : Component> {
    var root: RootComponent<T>? = null

    companion object {
        fun <T : Component> create(build: UIDefinition<T>.() -> Unit) = UIDefinition<T>().apply(build)
    }
}