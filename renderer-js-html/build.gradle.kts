plugins {
    kotlin("multiplatform")
}

group = "dev.synapsetech.kui"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":core"))
            }
        }
        val jsTest by getting
    }
}