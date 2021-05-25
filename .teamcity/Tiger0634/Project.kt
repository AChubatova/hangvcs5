package Tiger0634

import Tiger0634.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0634")
    name = "Tiger0634"

    vcsRoot(Tiger0634_cVCSroot)
})
