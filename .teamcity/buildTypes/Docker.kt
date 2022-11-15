package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.dockerCommand

object Docker : BuildType({
    name = "Docker"

    steps {
        dockerCommand {
            commandType = build {
                source = file {
                    path = "docker.file"
                }
                commandArgs = "--pull"
            }
        }
    }
})
