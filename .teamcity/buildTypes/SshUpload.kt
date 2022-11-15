package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.SSHUpload
import jetbrains.buildServer.configs.kotlin.buildSteps.sshUpload

object SshUpload : BuildType({
    name = "SSH_Upload"

    steps {
        sshUpload {
            transportProtocol = SSHUpload.TransportProtocol.SCP
            sourcePath = "*.zip => winFiles"
            targetUrl = "localhost"
            authMethod = uploadedKey {
                username = "user"
            }
        }
    }
})
