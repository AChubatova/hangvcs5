package Tiger0234

import Tiger0234.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0234")
    name = "Tiger0234"

    vcsRoot(Tiger0234_cVCSroot)
})
