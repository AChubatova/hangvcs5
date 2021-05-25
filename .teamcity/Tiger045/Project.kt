package Tiger045

import Tiger045.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger045")
    name = "Tiger045"

    vcsRoot(Tiger045_cVCSroot)
})
