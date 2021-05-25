package Tiger01021

import Tiger01021.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01021")
    name = "Tiger01021"

    vcsRoot(Tiger01021_cVCSroot)
})
