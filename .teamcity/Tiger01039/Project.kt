package Tiger01039

import Tiger01039.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01039")
    name = "Tiger01039"

    vcsRoot(Tiger01039_cVCSroot)
})
