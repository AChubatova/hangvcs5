package Tiger081

import Tiger081.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger081")
    name = "Tiger081"

    vcsRoot(Tiger081_cVCSroot)
})
