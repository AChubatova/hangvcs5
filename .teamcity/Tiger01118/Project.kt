package Tiger01118

import Tiger01118.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01118")
    name = "Tiger01118"

    vcsRoot(Tiger01118_cVCSroot)
})
