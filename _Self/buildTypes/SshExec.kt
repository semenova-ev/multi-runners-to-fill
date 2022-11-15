package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.sshExec

object SshExec : BuildType({
    name = "SSH_Exec"

    steps {
        sshExec {
            commands = "cmd"
            targetUrl = "localhost"
            authMethod = uploadedKey {
                username = "user"
            }
        }
    }
})
