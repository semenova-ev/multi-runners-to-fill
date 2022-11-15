package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.nunit

object NUnit : BuildType({
    name = "NUnit"

    steps {
        nunit {
            nunitPath = "nunit.exe"
            includeTests = "dir"
        }
    }
})
