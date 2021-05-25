package Tiger060

import Tiger060.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger060")
    name = "Tiger060"

    vcsRoot(Tiger060_cVCSroot)
})
