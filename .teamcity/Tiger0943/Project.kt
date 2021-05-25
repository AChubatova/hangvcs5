package Tiger0943

import Tiger0943.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0943")
    name = "Tiger0943"

    vcsRoot(Tiger0943_cVCSroot)
})
