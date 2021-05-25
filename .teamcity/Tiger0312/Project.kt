package Tiger0312

import Tiger0312.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0312")
    name = "Tiger0312"

    vcsRoot(Tiger0312_cVCSroot)
})
