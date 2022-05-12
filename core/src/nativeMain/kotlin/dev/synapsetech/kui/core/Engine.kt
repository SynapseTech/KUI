package dev.synapsetech.kui.core

import dev.synapsetech.kui.rendering.Renderer
import kotlin.system.exitProcess

actual class Engine {
    actual var renderer: Renderer<Any>? = null

    actual suspend fun start() {
        if (renderer == null) {
            println("Renderer must not be null during runtime. Please set it to an appropriate platform renderer")
            exitProcess(1)
        }

        // todo: runtime logic
    }
}