package Tiger0828

import Tiger0828.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0828")
    name = "Tiger0828"

    vcsRoot(Tiger0828_cVCSroot)
})
