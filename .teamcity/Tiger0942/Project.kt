package Tiger0942

import Tiger0942.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0942")
    name = "Tiger0942"

    vcsRoot(Tiger0942_cVCSroot)
})
