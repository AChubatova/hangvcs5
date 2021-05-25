package Tiger067

import Tiger067.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger067")
    name = "Tiger067"

    vcsRoot(Tiger067_cVCSroot)
})
