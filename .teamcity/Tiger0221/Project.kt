package Tiger0221

import Tiger0221.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0221")
    name = "Tiger0221"

    vcsRoot(Tiger0221_cVCSroot)
})
