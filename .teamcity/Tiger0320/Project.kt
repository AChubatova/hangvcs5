package Tiger0320

import Tiger0320.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0320")
    name = "Tiger0320"

    vcsRoot(Tiger0320_cVCSroot)
})
