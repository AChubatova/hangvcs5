package Tiger0330

import Tiger0330.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0330")
    name = "Tiger0330"

    vcsRoot(Tiger0330_cVCSroot)
})
