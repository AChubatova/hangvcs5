package Tiger0838

import Tiger0838.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0838")
    name = "Tiger0838"

    vcsRoot(Tiger0838_cVCSroot)
})
