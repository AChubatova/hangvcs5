package Tiger0215

import Tiger0215.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0215")
    name = "Tiger0215"

    vcsRoot(Tiger0215_cVCSroot)
})
