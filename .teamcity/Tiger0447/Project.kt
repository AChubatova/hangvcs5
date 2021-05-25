package Tiger0447

import Tiger0447.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0447")
    name = "Tiger0447"

    vcsRoot(Tiger0447_cVCSroot)
})
