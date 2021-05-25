package Tiger0237

import Tiger0237.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0237")
    name = "Tiger0237"

    vcsRoot(Tiger0237_cVCSroot)
})
