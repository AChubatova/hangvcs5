package Tiger0431

import Tiger0431.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0431")
    name = "Tiger0431"

    vcsRoot(Tiger0431_cVCSroot)
})
