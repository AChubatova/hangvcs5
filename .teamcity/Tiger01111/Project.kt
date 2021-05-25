package Tiger01111

import Tiger01111.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01111")
    name = "Tiger01111"

    vcsRoot(Tiger01111_cVCSroot)
})
