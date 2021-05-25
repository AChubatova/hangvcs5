package Tiger0745

import Tiger0745.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0745")
    name = "Tiger0745"

    vcsRoot(Tiger0745_cVCSroot)
})
