package Tiger080

import Tiger080.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger080")
    name = "Tiger080"

    vcsRoot(Tiger080_cVCSroot)
})
