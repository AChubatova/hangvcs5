package Tiger070

import Tiger070.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger070")
    name = "Tiger070"

    vcsRoot(Tiger070_cVCSroot)
})
