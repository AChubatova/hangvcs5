package Tiger0118

import Tiger0118.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0118")
    name = "Tiger0118"

    vcsRoot(Tiger0118_cVCSroot)
})
