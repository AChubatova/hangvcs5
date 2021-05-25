package Tiger01120

import Tiger01120.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01120")
    name = "Tiger01120"

    vcsRoot(Tiger01120_cVCSroot)
})
