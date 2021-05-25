package Tiger063

import Tiger063.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger063")
    name = "Tiger063"

    vcsRoot(Tiger063_cVCSroot)
})
