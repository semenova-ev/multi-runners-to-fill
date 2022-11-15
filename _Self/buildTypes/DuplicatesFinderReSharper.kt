package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.reSharperDuplicates

object DuplicatesFinderReSharper : BuildType({
    name = "DuplicatesFinder_ReSharper"

    steps {
        reSharperDuplicates {
            cltPath = "%teamcity.tool.jetbrains.resharper-clt.DEFAULT%"
        }
    }
})
