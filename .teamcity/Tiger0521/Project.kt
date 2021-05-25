package Tiger0521

import Tiger0521.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0521")
    name = "Tiger0521"

    vcsRoot(Tiger0521_cVCSroot)
})
