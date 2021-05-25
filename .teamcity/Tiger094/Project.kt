package Tiger094

import Tiger094.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger094")
    name = "Tiger094"

    vcsRoot(Tiger094_cVCSroot)
})
