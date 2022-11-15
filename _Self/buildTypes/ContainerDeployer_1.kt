package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.ContainerDeployer
import jetbrains.buildServer.configs.kotlin.buildSteps.containerDeployer

object ContainerDeployer_1 : BuildType({
    id("ContainerDeployer")
    name = "ContainerDeployer"

    steps {
        containerDeployer {
            targetUrl = "localhost:8080"
            containerType = ContainerDeployer.ContainerType.TOMCAT_8_X
            username = "user"
            password = "cksad8fb185b72222377d8bd944a6ae752d+ZH9AZa5rGPxURjt9IJNdw=="
            sourcePath = "my.war"
        }
    }
})
