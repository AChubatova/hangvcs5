package Tiger0338

import Tiger0338.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0338")
    name = "Tiger0338"

    vcsRoot(Tiger0338_cVCSroot)
})
