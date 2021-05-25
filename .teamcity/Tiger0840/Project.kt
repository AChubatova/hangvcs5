package Tiger0840

import Tiger0840.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0840")
    name = "Tiger0840"

    vcsRoot(Tiger0840_cVCSroot)
})
