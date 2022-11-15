package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.nodeJS

object NodeJS : BuildType({
    name = "NodeJS"

    steps {
        nodeJS {
            shellScript = """
                npm ci
                npm run test
            """.trimIndent()
        }
    }
})
