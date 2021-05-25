package Tiger0334

import Tiger0334.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0334")
    name = "Tiger0334"

    vcsRoot(Tiger0334_cVCSroot)
})
