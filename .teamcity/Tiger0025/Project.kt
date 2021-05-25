package Tiger0025

import Tiger0025.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0025")
    name = "Tiger0025"

    vcsRoot(Tiger0025_cVCSroot)
})
