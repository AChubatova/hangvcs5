package Tiger0523

import Tiger0523.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0523")
    name = "Tiger0523"

    vcsRoot(Tiger0523_cVCSroot)
})
