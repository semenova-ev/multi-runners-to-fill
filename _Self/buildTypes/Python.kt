package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python

object Python : BuildType({
    name = "Python"

    steps {
        python {
            command = file {
                filename = "file.py"
            }
        }
    }
})
