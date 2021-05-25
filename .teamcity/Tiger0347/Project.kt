package Tiger0347

import Tiger0347.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0347")
    name = "Tiger0347"

    vcsRoot(Tiger0347_cVCSroot)
})
