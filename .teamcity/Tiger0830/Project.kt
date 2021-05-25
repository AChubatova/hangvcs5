package Tiger0830

import Tiger0830.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0830")
    name = "Tiger0830"

    vcsRoot(Tiger0830_cVCSroot)
})
