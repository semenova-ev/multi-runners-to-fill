package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.kotlinScript

object KotlinScript : BuildType({
    name = "KotlinScript"

    steps {
        kotlinScript {
            content = "data class Data()"
        }
    }
})
