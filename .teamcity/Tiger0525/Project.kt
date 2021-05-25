package Tiger0525

import Tiger0525.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0525")
    name = "Tiger0525"

    vcsRoot(Tiger0525_cVCSroot)
})
