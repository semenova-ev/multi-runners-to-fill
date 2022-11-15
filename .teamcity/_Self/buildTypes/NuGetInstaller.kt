package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.nuGetInstaller

object NuGetInstaller : BuildType({
    name = "NuGet_Installer"

    steps {
        nuGetInstaller {
            toolPath = "NuGet.exe"
            projects = "path.sln"
            updatePackages = updateParams {
            }
        }
    }
})
