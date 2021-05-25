package Tiger0042

import Tiger0042.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0042")
    name = "Tiger0042"

    vcsRoot(Tiger0042_cVCSroot)
})
