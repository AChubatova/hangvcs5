package Tiger01018

import Tiger01018.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01018")
    name = "Tiger01018"

    vcsRoot(Tiger01018_cVCSroot)
})
