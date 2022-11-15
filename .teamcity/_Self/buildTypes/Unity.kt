package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object Unity : BuildType({
    name = "Unity"

    steps {
        step {
            type = "unity"
        }
    }
})
