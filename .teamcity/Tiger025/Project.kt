package Tiger025

import Tiger025.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger025")
    name = "Tiger025"

    vcsRoot(Tiger025_cVCSroot)
})
