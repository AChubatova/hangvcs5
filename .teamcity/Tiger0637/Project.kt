package Tiger0637

import Tiger0637.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0637")
    name = "Tiger0637"

    vcsRoot(Tiger0637_cVCSroot)
})
