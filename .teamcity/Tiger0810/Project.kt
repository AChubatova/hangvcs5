package Tiger0810

import Tiger0810.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0810")
    name = "Tiger0810"

    vcsRoot(Tiger0810_cVCSroot)
})
