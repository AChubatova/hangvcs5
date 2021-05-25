package Tiger01017

import Tiger01017.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01017")
    name = "Tiger01017"

    vcsRoot(Tiger01017_cVCSroot)
})
