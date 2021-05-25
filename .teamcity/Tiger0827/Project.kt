package Tiger0827

import Tiger0827.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0827")
    name = "Tiger0827"

    vcsRoot(Tiger0827_cVCSroot)
})
