package Tiger0533

import Tiger0533.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0533")
    name = "Tiger0533"

    vcsRoot(Tiger0533_cVCSroot)
})
