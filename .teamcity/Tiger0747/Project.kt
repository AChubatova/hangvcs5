package Tiger0747

import Tiger0747.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0747")
    name = "Tiger0747"

    vcsRoot(Tiger0747_cVCSroot)
})
