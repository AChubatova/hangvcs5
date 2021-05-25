package Tiger0628

import Tiger0628.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0628")
    name = "Tiger0628"

    vcsRoot(Tiger0628_cVCSroot)
})
