package Tiger0812

import Tiger0812.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0812")
    name = "Tiger0812"

    vcsRoot(Tiger0812_cVCSroot)
})
