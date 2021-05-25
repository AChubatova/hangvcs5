package Tiger046

import Tiger046.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger046")
    name = "Tiger046"

    vcsRoot(Tiger046_cVCSroot)
})
