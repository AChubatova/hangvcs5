package Tiger0643

import Tiger0643.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0643")
    name = "Tiger0643"

    vcsRoot(Tiger0643_cVCSroot)
})
