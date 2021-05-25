package Tiger01114

import Tiger01114.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01114")
    name = "Tiger01114"

    vcsRoot(Tiger01114_cVCSroot)
})
