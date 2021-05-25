package Tiger01129

import Tiger01129.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01129")
    name = "Tiger01129"

    vcsRoot(Tiger01129_cVCSroot)
})
