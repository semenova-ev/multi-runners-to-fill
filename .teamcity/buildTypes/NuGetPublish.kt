package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.nuGetPublish

object NuGetPublish : BuildType({
    name = "NuGet_Publish"

    steps {
        nuGetPublish {
            toolPath = "NuGet.exe"
            packages = "pack.nupkg"
        }
    }
})
