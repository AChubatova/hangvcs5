package Tiger01034

import Tiger01034.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01034")
    name = "Tiger01034"

    vcsRoot(Tiger01034_cVCSroot)
})
