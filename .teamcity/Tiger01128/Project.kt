package Tiger01128

import Tiger01128.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01128")
    name = "Tiger01128"

    vcsRoot(Tiger01128_cVCSroot)
})
