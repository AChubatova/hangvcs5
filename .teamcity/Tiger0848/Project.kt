package Tiger0848

import Tiger0848.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0848")
    name = "Tiger0848"

    vcsRoot(Tiger0848_cVCSroot)
})
