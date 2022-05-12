package dev.synapsetech.kui.component

actual abstract class Component(actual val parent: Component?) {
    actual val children = mutableListOf<Component>()

    actual abstract fun build(): ComponentMeta
}