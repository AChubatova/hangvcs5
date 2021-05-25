package Tiger0844

import Tiger0844.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0844")
    name = "Tiger0844"

    vcsRoot(Tiger0844_cVCSroot)
})
