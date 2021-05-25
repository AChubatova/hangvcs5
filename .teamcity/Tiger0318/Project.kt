package Tiger0318

import Tiger0318.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0318")
    name = "Tiger0318"

    vcsRoot(Tiger0318_cVCSroot)
})
