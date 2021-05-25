package Tiger01115

import Tiger01115.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01115")
    name = "Tiger01115"

    vcsRoot(Tiger01115_cVCSroot)
})
