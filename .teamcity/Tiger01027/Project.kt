package Tiger01027

import Tiger01027.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01027")
    name = "Tiger01027"

    vcsRoot(Tiger01027_cVCSroot)
})
