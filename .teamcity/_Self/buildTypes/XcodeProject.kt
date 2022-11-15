package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.xcode

object XcodeProject : BuildType({
    name = "XcodeProject"

    steps {
        xcode {
            enabled = false
            projectPath = "some.xcodeproj"
            buildType = targetBased {
                platform = "iphoneos"
            }
        }
    }
})
