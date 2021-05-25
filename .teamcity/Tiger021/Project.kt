package Tiger021

import Tiger021.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger021")
    name = "Tiger021"

    vcsRoot(Tiger021_cVCSroot)
})
