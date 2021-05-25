package Tiger0030

import Tiger0030.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0030")
    name = "Tiger0030"

    vcsRoot(Tiger0030_cVCSroot)
})
