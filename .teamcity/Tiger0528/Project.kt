package Tiger0528

import Tiger0528.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0528")
    name = "Tiger0528"

    vcsRoot(Tiger0528_cVCSroot)
})
