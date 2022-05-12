package dev.synapsetech.kui.component

expect abstract class Component(parent: Component?) {
    val parent: Component?
    val children: MutableList<Component>
    abstract fun build(): ComponentMeta
}