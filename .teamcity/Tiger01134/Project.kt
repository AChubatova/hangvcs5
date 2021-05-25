package Tiger01134

import Tiger01134.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01134")
    name = "Tiger01134"

    vcsRoot(Tiger01134_cVCSroot)
})
