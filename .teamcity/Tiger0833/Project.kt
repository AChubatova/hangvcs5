package Tiger0833

import Tiger0833.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0833")
    name = "Tiger0833"

    vcsRoot(Tiger0833_cVCSroot)
})
