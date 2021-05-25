package Tiger054

import Tiger054.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger054")
    name = "Tiger054"

    vcsRoot(Tiger054_cVCSroot)
})
