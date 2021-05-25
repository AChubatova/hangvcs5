package Tiger079

import Tiger079.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger079")
    name = "Tiger079"

    vcsRoot(Tiger079_cVCSroot)
})
