package Tiger0103

import Tiger0103.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0103")
    name = "Tiger0103"

    vcsRoot(Tiger0103_cVCSroot)
})
