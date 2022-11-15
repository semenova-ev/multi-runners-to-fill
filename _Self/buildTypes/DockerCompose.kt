package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dockerCompose

object DockerCompose : BuildType({
    name = "DockerCompose"

    steps {
        dockerCompose {
        }
    }
})
