package Tiger01020

import Tiger01020.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01020")
    name = "Tiger01020"

    vcsRoot(Tiger01020_cVCSroot)
})
