package Tiger01132

import Tiger01132.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01132")
    name = "Tiger01132"

    vcsRoot(Tiger01132_cVCSroot)
})
