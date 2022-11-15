package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object OctopusDeployCreateRelease : BuildType({
    name = "OctopusDeploy_CreateRelease"

    steps {
        step {
            type = "octopus.create.release"
            param("octopus_version", "3.0+")
            param("octopus_host", "localhost:8080")
            param("octopus_project_name", "project")
            param("secure:octopus_apikey", "cksad8fb185b72222377d8bd944a6ae752dwUuXBhX0ubFdPz8cjfeEqw==")
        }
    }
})
