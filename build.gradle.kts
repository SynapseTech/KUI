plugins {
    base
    kotlin("jvm") version "1.7.0" apply false
}

allprojects {
    group = "dev.synapsetech.kui"
    version = "0.0.1"

    repositories {
        mavenCentral()
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}