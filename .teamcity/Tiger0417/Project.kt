package Tiger0417

import Tiger0417.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0417")
    name = "Tiger0417"

    vcsRoot(Tiger0417_cVCSroot)
})
