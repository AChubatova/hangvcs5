package Tiger023

import Tiger023.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger023")
    name = "Tiger023"

    vcsRoot(Tiger023_cVCSroot)
})
