package Tiger0448

import Tiger0448.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0448")
    name = "Tiger0448"

    vcsRoot(Tiger0448_cVCSroot)
})
