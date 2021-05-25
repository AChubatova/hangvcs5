package Tiger0630

import Tiger0630.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0630")
    name = "Tiger0630"

    vcsRoot(Tiger0630_cVCSroot)
})
