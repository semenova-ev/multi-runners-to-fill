package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.FTPUpload
import jetbrains.buildServer.configs.kotlin.buildSteps.ftpUpload

object FTPUpload_1 : BuildType({
    id("FTPUpload")
    name = "FTPUpload"

    steps {
        ftpUpload {
            targetUrl = "localhost"
            securityMode = FTPUpload.SecurityMode.NONE
            authMethod = anonymous()
            transferMode = FTPUpload.TransferMode.AUTO
            sourcePath = "./"
        }
    }
})
