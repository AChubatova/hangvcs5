package Tiger0329

import Tiger0329.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0329")
    name = "Tiger0329"

    vcsRoot(Tiger0329_cVCSroot)
})
