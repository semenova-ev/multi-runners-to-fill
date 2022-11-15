package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.smbUpload

object SmbUpload : BuildType({
    name = "SMB_Upload"

    steps {
        smbUpload {
            targetUrl = """\\host\share"""
            sourcePath = "*.zip => winFiles"
        }
    }
})
