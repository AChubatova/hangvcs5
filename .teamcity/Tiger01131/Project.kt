package Tiger01131

import Tiger01131.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01131")
    name = "Tiger01131"

    vcsRoot(Tiger01131_cVCSroot)
})
