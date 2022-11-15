package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.gradle

object Gradle : BuildType({
    name = "Gradle"

    steps {
        gradle {
        }
    }
})
