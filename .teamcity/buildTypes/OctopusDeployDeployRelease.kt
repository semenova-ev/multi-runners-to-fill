package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object OctopusDeployDeployRelease : BuildType({
    name = "OctopusDeploy_DeployRelease"

    steps {
        step {
            type = "octopus.deploy.release"
            param("octopus_version", "3.0+")
            param("octopus_host", "localhost:8080")
            param("octopus_project_name", "project")
            param("octopus_deployto", "env")
            param("secure:octopus_apikey", "cksad8fb185b72222377d8bd944a6ae752dwUuXBhX0ubFdPz8cjfeEqw==")
            param("octopus_releasenumber", "latest")
        }
    }
})
