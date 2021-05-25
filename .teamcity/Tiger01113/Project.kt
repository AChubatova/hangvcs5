package Tiger01113

import Tiger01113.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01113")
    name = "Tiger01113"

    vcsRoot(Tiger01113_cVCSroot)
})
