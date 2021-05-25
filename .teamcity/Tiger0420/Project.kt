package Tiger0420

import Tiger0420.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0420")
    name = "Tiger0420"

    vcsRoot(Tiger0420_cVCSroot)
})
