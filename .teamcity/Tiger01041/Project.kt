package Tiger01041

import Tiger01041.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01041")
    name = "Tiger01041"

    vcsRoot(Tiger01041_cVCSroot)
})
