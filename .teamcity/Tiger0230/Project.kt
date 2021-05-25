package Tiger0230

import Tiger0230.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0230")
    name = "Tiger0230"

    vcsRoot(Tiger0230_cVCSroot)
})
