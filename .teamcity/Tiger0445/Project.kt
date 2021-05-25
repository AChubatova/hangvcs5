package Tiger0445

import Tiger0445.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0445")
    name = "Tiger0445"

    vcsRoot(Tiger0445_cVCSroot)
})
