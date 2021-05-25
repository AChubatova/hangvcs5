package Tiger095

import Tiger095.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger095")
    name = "Tiger095"

    vcsRoot(Tiger095_cVCSroot)
})
