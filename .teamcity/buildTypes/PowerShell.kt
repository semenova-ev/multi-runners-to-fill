package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.powerShell

object PowerShell : BuildType({
    name = "PowerShell"

    steps {
        powerShell {
            scriptMode = script {
                content = """
                    Write-Host 'Hello, World!'
                    ${'$'}env:TEST = ';TESTS'
                """.trimIndent()
            }
            param("jetbrains_powershell_script_file", "script.ps1")
        }
    }
})
