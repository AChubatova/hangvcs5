package Tiger031

import Tiger031.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger031")
    name = "Tiger031"

    vcsRoot(Tiger031_cVCSroot)
})
