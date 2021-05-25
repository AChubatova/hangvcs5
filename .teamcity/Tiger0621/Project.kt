package Tiger0621

import Tiger0621.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0621")
    name = "Tiger0621"

    vcsRoot(Tiger0621_cVCSroot)
})
