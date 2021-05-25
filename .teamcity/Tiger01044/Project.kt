package Tiger01044

import Tiger01044.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01044")
    name = "Tiger01044"

    vcsRoot(Tiger01044_cVCSroot)
})
