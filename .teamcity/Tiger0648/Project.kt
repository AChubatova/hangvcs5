package Tiger0648

import Tiger0648.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0648")
    name = "Tiger0648"

    vcsRoot(Tiger0648_cVCSroot)
})
