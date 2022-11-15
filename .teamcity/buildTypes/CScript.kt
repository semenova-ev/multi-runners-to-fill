package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.csharpScript

object CScript : BuildType({
    name = "C# Script"

    steps {
        csharpScript {
            content = """Console.WriteLine("Hello, world!")"""
            tool = "%teamcity.tool.TeamCity.csi.1.0.3%"
            dockerImage = "mcr.microsoft.com/dotnet/aspnet:6.0"
        }
    }
})
