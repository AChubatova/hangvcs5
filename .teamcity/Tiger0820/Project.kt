package Tiger0820

import Tiger0820.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0820")
    name = "Tiger0820"

    vcsRoot(Tiger0820_cVCSroot)
})
