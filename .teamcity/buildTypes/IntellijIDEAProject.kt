package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ideaRunner

object IntellijIDEAProject : BuildType({
    name = "IntellijIDEA_Project"

    steps {
        ideaRunner {
            pathToProject = ""
            jvmArgs = "-Xmx256m"
        }
    }
})
