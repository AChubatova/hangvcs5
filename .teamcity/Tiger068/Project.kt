package Tiger068

import Tiger068.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger068")
    name = "Tiger068"

    vcsRoot(Tiger068_cVCSroot)
})
