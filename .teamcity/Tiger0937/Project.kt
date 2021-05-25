package Tiger0937

import Tiger0937.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0937")
    name = "Tiger0937"

    vcsRoot(Tiger0937_cVCSroot)
})
