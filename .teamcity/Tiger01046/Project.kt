package Tiger01046

import Tiger01046.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01046")
    name = "Tiger01046"

    vcsRoot(Tiger01046_cVCSroot)
})
