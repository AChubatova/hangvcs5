package Tiger01030

import Tiger01030.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01030")
    name = "Tiger01030"

    vcsRoot(Tiger01030_cVCSroot)
})
