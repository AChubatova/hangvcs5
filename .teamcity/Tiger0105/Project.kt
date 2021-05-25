package Tiger0105

import Tiger0105.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0105")
    name = "Tiger0105"

    vcsRoot(Tiger0105_cVCSroot)
})
