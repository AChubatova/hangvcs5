package Tiger0423

import Tiger0423.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0423")
    name = "Tiger0423"

    vcsRoot(Tiger0423_cVCSroot)
})
