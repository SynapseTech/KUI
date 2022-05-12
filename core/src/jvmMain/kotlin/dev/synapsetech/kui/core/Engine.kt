package dev.synapsetech.kui.core

import dev.synapsetech.kui.component.Component
import dev.synapsetech.kui.component.UIDefinition
import dev.synapsetech.kui.rendering.Renderer
import kotlin.system.exitProcess

actual class Engine {
    actual var renderer: Renderer<Component>? = null
    actual var uiDefinition: UIDefinition<Component>? = null

    actual suspend fun start() {
        if (renderer == null) {
            println("renderer must not be null during runtime. Please set it to an appropriate platform renderer")
            exitProcess(1)
        }

        if (uiDefinition == null) {
            println("uiDefinition must not be null during runtime. ")
            exitProcess(1)
        }

        uiDefinition!!.also {
            if (it.root == null) {
                exitProcess(1)
            }

            it.root!!.also { uiRoot ->
                renderer!!._build(uiRoot)
            }
        }

        // todo: runtime logic
    }
}