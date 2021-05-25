package Tiger0749

import Tiger0749.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0749")
    name = "Tiger0749"

    vcsRoot(Tiger0749_cVCSroot)
})
