package Tiger0618

import Tiger0618.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0618")
    name = "Tiger0618"

    vcsRoot(Tiger0618_cVCSroot)
})
