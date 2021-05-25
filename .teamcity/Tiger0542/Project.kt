package Tiger0542

import Tiger0542.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0542")
    name = "Tiger0542"

    vcsRoot(Tiger0542_cVCSroot)
})
