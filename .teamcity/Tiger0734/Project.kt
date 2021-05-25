package Tiger0734

import Tiger0734.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0734")
    name = "Tiger0734"

    vcsRoot(Tiger0734_cVCSroot)
})
