package Tiger0245

import Tiger0245.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0245")
    name = "Tiger0245"

    vcsRoot(Tiger0245_cVCSroot)
})
