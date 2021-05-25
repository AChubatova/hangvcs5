package Tiger0422

import Tiger0422.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0422")
    name = "Tiger0422"

    vcsRoot(Tiger0422_cVCSroot)
})
