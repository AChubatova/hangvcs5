package Tiger0333

import Tiger0333.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0333")
    name = "Tiger0333"

    vcsRoot(Tiger0333_cVCSroot)
})
