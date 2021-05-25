package Tiger01022

import Tiger01022.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01022")
    name = "Tiger01022"

    vcsRoot(Tiger01022_cVCSroot)
})
