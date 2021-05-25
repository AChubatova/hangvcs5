package Tiger062

import Tiger062.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger062")
    name = "Tiger062"

    vcsRoot(Tiger062_cVCSroot)
})
