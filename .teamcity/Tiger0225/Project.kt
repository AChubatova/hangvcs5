package Tiger0225

import Tiger0225.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0225")
    name = "Tiger0225"

    vcsRoot(Tiger0225_cVCSroot)
})
