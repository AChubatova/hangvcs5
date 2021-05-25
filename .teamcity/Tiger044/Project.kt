package Tiger044

import Tiger044.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger044")
    name = "Tiger044"

    vcsRoot(Tiger044_cVCSroot)
})
