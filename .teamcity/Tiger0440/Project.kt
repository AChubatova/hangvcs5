package Tiger0440

import Tiger0440.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0440")
    name = "Tiger0440"

    vcsRoot(Tiger0440_cVCSroot)
})
