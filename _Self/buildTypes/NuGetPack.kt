package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.nuGetPack

object NuGetPack : BuildType({
    name = "NuGet_Pack"

    steps {
        nuGetPack {
            toolPath = "NuGet.exe"
            paths = "file.nuspec"
            outputDir = "dir"
            cleanOutputDir = false
        }
    }
})
