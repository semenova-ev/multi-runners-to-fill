package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.ReSharperInspections
import jetbrains.buildServer.configs.kotlin.buildSteps.reSharperInspections

object InspectionsReSharper : BuildType({
    name = "Inspections_ReSharper"

    steps {
        reSharperInspections {
            solutionPath = "path"
            cltPath = "%teamcity.tool.jetbrains.resharper-clt.DEFAULT%"
            cltPlatform = ReSharperInspections.Platform.X64
        }
    }
})
