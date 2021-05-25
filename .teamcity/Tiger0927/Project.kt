package Tiger0927

import Tiger0927.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0927")
    name = "Tiger0927"

    vcsRoot(Tiger0927_cVCSroot)
})
