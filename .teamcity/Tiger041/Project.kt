package Tiger041

import Tiger041.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger041")
    name = "Tiger041"

    vcsRoot(Tiger041_cVCSroot)
})
