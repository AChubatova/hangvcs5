package Tiger0113

import Tiger0113.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0113")
    name = "Tiger0113"

    vcsRoot(Tiger0113_cVCSroot)
})
