package Tiger027

import Tiger027.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger027")
    name = "Tiger027"

    vcsRoot(Tiger027_cVCSroot)
})
