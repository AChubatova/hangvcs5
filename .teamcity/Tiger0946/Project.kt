package Tiger0946

import Tiger0946.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0946")
    name = "Tiger0946"

    vcsRoot(Tiger0946_cVCSroot)
})
