package Tiger0740

import Tiger0740.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0740")
    name = "Tiger0740"

    vcsRoot(Tiger0740_cVCSroot)
})
