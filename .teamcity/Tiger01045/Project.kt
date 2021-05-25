package Tiger01045

import Tiger01045.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01045")
    name = "Tiger01045"

    vcsRoot(Tiger01045_cVCSroot)
})
