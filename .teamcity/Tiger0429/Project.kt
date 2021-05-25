package Tiger0429

import Tiger0429.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0429")
    name = "Tiger0429"

    vcsRoot(Tiger0429_cVCSroot)
})
