package Tiger01025

import Tiger01025.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01025")
    name = "Tiger01025"

    vcsRoot(Tiger01025_cVCSroot)
})
