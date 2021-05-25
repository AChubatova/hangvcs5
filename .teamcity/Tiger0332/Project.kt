package Tiger0332

import Tiger0332.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0332")
    name = "Tiger0332"

    vcsRoot(Tiger0332_cVCSroot)
})
