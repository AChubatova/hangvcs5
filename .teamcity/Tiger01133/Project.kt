package Tiger01133

import Tiger01133.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01133")
    name = "Tiger01133"

    vcsRoot(Tiger01133_cVCSroot)
})
