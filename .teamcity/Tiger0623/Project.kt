package Tiger0623

import Tiger0623.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0623")
    name = "Tiger0623"

    vcsRoot(Tiger0623_cVCSroot)
})
