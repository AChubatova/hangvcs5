package Tiger085

import Tiger085.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger085")
    name = "Tiger085"

    vcsRoot(Tiger085_cVCSroot)
})
