package Tiger01036

import Tiger01036.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01036")
    name = "Tiger01036"

    vcsRoot(Tiger01036_cVCSroot)
})
