package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.simpleBuildTool

object SimpleBuildToolScala : BuildType({
    name = "SimpleBuildTool_Scala"

    steps {
        simpleBuildTool {
            installationMode = custom {
                sbtHome = "path"
            }
        }
    }
})
