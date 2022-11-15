package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ideaInspections

object InspectionsIdea : BuildType({
    name = "Inspections_IDEA"

    params {
        param("env.JDK_18", "/java")
    }

    steps {
        ideaInspections {
            pathToProject = "pom.xml"
            jvmArgs = "-Xmx512m -XX:ReservedCodeCacheSize=240m"
            targetJdkHome = "%env.JDK_18%"
            ideaAppHome = "%teamcity.tool.intellij.DEFAULT%"
        }
    }
})
