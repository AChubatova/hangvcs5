package Tiger030

import Tiger030.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger030")
    name = "Tiger030"

    vcsRoot(Tiger030_cVCSroot)
})
