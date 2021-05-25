package Tiger0917

import Tiger0917.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0917")
    name = "Tiger0917"

    vcsRoot(Tiger0917_cVCSroot)
})
