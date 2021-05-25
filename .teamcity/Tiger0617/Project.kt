package Tiger0617

import Tiger0617.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0617")
    name = "Tiger0617"

    vcsRoot(Tiger0617_cVCSroot)
})
