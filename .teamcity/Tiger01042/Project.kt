package Tiger01042

import Tiger01042.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01042")
    name = "Tiger01042"

    vcsRoot(Tiger01042_cVCSroot)
})
