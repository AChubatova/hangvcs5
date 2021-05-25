package Tiger0711

import Tiger0711.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0711")
    name = "Tiger0711"

    vcsRoot(Tiger0711_cVCSroot)
})
