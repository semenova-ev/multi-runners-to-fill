package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

object Maven : BuildType({
    name = "Maven"

    steps {
        maven {
        }
    }
})
