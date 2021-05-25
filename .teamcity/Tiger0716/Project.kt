package Tiger0716

import Tiger0716.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0716")
    name = "Tiger0716"

    vcsRoot(Tiger0716_cVCSroot)
})
