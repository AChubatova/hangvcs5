package Tiger0544

import Tiger0544.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0544")
    name = "Tiger0544"

    vcsRoot(Tiger0544_cVCSroot)
})
