package Tiger0341

import Tiger0341.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0341")
    name = "Tiger0341"

    vcsRoot(Tiger0341_cVCSroot)
})
