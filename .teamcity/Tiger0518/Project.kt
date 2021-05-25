package Tiger0518

import Tiger0518.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0518")
    name = "Tiger0518"

    vcsRoot(Tiger0518_cVCSroot)
})
