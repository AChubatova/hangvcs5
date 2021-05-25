package Tiger0233

import Tiger0233.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0233")
    name = "Tiger0233"

    vcsRoot(Tiger0233_cVCSroot)
})
