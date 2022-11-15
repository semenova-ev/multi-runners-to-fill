package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ideaDuplicates

object DuplicatesFinderJava : BuildType({
    name = "DuplicatesFinder_Java"

    params {
        param("env.JDK_18", "/java")
    }

    steps {
        ideaDuplicates {
            pathToProject = "build.gradle"
            jvmArgs = "-Xmx1G -XX:ReservedCodeCacheSize=240m"
            targetJdkHome = "%env.JDK_18%"
            ideaAppHome = "%teamcity.tool.intellij.DEFAULT%"
            lowerBound = 10
            discardCost = 0
            distinguishMethods = true
            distinguishTypes = true
            distinguishLiterals = true
            extractSubexpressions = true
        }
    }
})
