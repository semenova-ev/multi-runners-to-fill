package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object OctopusDeployPushPackages : BuildType({
    name = "OctopusDeploy_PushPackages"

    steps {
        step {
            type = "octopus.push.package"
            param("octopus_host", "localhost:8080")
            param("octopus_packagepaths", "published-webapp/**/* => MyApp.%build.number%.zip")
            param("octopus_forcepush", "false")
            param("secure:octopus_apikey", "cksad8fb185b72222377d8bd944a6ae752dwUuXBhX0ubFdPz8cjfeEqw==")
        }
    }
})
