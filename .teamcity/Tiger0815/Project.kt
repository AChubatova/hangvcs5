package Tiger0815

import Tiger0815.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0815")
    name = "Tiger0815"

    vcsRoot(Tiger0815_cVCSroot)
})
