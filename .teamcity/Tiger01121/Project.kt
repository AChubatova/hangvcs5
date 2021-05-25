package Tiger01121

import Tiger01121.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01121")
    name = "Tiger01121"

    vcsRoot(Tiger01121_cVCSroot)
})
