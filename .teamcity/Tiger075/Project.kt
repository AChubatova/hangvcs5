package Tiger075

import Tiger075.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger075")
    name = "Tiger075"

    vcsRoot(Tiger075_cVCSroot)
})
