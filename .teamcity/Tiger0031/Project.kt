package Tiger0031

import Tiger0031.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0031")
    name = "Tiger0031"

    vcsRoot(Tiger0031_cVCSroot)
})
