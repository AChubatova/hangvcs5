package Tiger022

import Tiger022.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger022")
    name = "Tiger022"

    vcsRoot(Tiger022_cVCSroot)
})
