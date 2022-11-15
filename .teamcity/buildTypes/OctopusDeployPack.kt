package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object OctopusDeployPack : BuildType({
    name = "OctopusDeploy_Pack"

    steps {
        step {
            type = "octopus.pack.package"
            param("octopus_packageoutputpath", "out")
            param("octopus_packageid", "package")
            param("octopus_packageversion", "1.0")
            param("octopus_packageformat", "NuPkg")
            param("octopus_packagesourcepath", "source")
        }
    }
})
