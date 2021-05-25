package Tiger0217

import Tiger0217.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0217")
    name = "Tiger0217"

    vcsRoot(Tiger0217_cVCSroot)
})
