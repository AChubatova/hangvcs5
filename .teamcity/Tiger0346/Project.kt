package Tiger0346

import Tiger0346.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0346")
    name = "Tiger0346"

    vcsRoot(Tiger0346_cVCSroot)
})
