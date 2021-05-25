package Tiger0835

import Tiger0835.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0835")
    name = "Tiger0835"

    vcsRoot(Tiger0835_cVCSroot)
})
