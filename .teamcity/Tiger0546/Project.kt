package Tiger0546

import Tiger0546.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0546")
    name = "Tiger0546"

    vcsRoot(Tiger0546_cVCSroot)
})
