package Tiger0110

import Tiger0110.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0110")
    name = "Tiger0110"

    vcsRoot(Tiger0110_cVCSroot)
})
