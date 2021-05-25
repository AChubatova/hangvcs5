package Tiger01110

import Tiger01110.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01110")
    name = "Tiger01110"

    vcsRoot(Tiger01110_cVCSroot)
})
