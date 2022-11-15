package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.fxCop

object FxCop : BuildType({
    name = "FxCop"

    steps {
        fxCop {
            inspectionSource = assemblies {
                files = "file"
            }
        }
    }
})
