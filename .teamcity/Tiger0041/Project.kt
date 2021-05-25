package Tiger0041

import Tiger0041.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0041")
    name = "Tiger0041"

    vcsRoot(Tiger0041_cVCSroot)
})
