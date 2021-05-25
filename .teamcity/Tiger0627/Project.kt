package Tiger0627

import Tiger0627.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0627")
    name = "Tiger0627"

    vcsRoot(Tiger0627_cVCSroot)
})
