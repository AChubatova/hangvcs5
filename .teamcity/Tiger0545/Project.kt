package Tiger0545

import Tiger0545.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0545")
    name = "Tiger0545"

    vcsRoot(Tiger0545_cVCSroot)
})
