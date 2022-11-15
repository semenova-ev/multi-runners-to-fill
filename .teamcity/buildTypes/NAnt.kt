package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.nant

object NAnt : BuildType({
    name = "NAnt"

    params {
        param("env.NAntHome", "home")
    }

    steps {
        nant {
            mode = nantFile {
                path = "path"
            }
            coverage = partcover {
            }
        }
    }
})
