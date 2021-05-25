package Tiger0246

import Tiger0246.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0246")
    name = "Tiger0246"

    vcsRoot(Tiger0246_cVCSroot)
})
