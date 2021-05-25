package Tiger0325

import Tiger0325.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0325")
    name = "Tiger0325"

    vcsRoot(Tiger0325_cVCSroot)
})
