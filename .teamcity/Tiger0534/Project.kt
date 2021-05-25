package Tiger0534

import Tiger0534.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0534")
    name = "Tiger0534"

    vcsRoot(Tiger0534_cVCSroot)
})
