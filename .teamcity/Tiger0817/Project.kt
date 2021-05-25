package Tiger0817

import Tiger0817.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0817")
    name = "Tiger0817"

    vcsRoot(Tiger0817_cVCSroot)
})
