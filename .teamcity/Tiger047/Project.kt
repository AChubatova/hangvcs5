package Tiger047

import Tiger047.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger047")
    name = "Tiger047"

    vcsRoot(Tiger047_cVCSroot)
})
