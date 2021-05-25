package Tiger024

import Tiger024.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger024")
    name = "Tiger024"

    vcsRoot(Tiger024_cVCSroot)
})
