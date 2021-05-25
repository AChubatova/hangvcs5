package Tiger088

import Tiger088.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger088")
    name = "Tiger088"

    vcsRoot(Tiger088_cVCSroot)
})
