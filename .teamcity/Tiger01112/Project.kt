package Tiger01112

import Tiger01112.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01112")
    name = "Tiger01112"

    vcsRoot(Tiger01112_cVCSroot)
})
