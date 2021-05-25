package Tiger01043

import Tiger01043.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01043")
    name = "Tiger01043"

    vcsRoot(Tiger01043_cVCSroot)
})
