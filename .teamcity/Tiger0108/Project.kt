package Tiger0108

import Tiger0108.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0108")
    name = "Tiger0108"

    vcsRoot(Tiger0108_cVCSroot)
})
