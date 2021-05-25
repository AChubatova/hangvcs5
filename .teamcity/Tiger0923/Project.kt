package Tiger0923

import Tiger0923.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0923")
    name = "Tiger0923"

    vcsRoot(Tiger0923_cVCSroot)
})
