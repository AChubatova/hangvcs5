package Tiger0101

import Tiger0101.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0101")
    name = "Tiger0101"

    vcsRoot(Tiger0101_cVCSroot)
})
