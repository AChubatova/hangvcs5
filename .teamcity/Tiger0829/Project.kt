package Tiger0829

import Tiger0829.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0829")
    name = "Tiger0829"

    vcsRoot(Tiger0829_cVCSroot)
})
