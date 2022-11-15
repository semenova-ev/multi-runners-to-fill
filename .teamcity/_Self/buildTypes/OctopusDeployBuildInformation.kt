package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object OctopusDeployBuildInformation : BuildType({
    name = "OctopusDeploy_BuildInformation"

    steps {
        step {
            type = "octopus.metadata"
            param("octopus_packageid", """
                MyCompany.MyApp
                MyCompany.MyApp2
            """.trimIndent())
            param("octopus_packageversion", "1.0")
            param("octopus_host", "localhost:8080")
            param("octopus_forcepush", "false")
            param("secure:octopus_apikey", "cksad8fb185b72222377d8bd944a6ae752duvtviZpjjhHTfQ/S1waDjQ==")
        }
    }
})
