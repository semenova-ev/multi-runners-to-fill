package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.mspec

object MSpec : BuildType({
    name = "MSpec"

    steps {
        mspec {
            mspecPath = "mspec.exe"
            includeTests = "test"
        }
    }
})
