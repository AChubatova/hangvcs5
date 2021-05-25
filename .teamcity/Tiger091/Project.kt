package Tiger091

import Tiger091.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger091")
    name = "Tiger091"

    vcsRoot(Tiger091_cVCSroot)
})
