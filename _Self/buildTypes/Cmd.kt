package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object Cmd : BuildType({
    name = "Cmd"

    steps {
        script {
            scriptContent = "sleep 1"
        }
    }
})
