package Tiger01031

import Tiger01031.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01031")
    name = "Tiger01031"

    vcsRoot(Tiger01031_cVCSroot)
})
