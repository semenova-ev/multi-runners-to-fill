package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.ant

object Ant : BuildType({
    name = "Ant"

    steps {
        ant {
            mode = antFile {
            }
        }
    }
})
