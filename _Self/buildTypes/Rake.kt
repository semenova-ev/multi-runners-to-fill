package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.rake

object Rake : BuildType({
    name = "Rake"

    steps {
        rake {
            rakefile = file {
                path = "path"
            }
        }
    }
})
