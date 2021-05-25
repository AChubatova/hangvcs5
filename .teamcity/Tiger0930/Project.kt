package Tiger0930

import Tiger0930.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0930")
    name = "Tiger0930"

    vcsRoot(Tiger0930_cVCSroot)
})
