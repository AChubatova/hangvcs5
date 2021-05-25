package Tiger0310

import Tiger0310.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0310")
    name = "Tiger0310"

    vcsRoot(Tiger0310_cVCSroot)
})
