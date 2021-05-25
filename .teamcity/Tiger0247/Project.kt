package Tiger0247

import Tiger0247.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0247")
    name = "Tiger0247"

    vcsRoot(Tiger0247_cVCSroot)
})
