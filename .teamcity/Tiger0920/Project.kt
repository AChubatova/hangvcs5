package Tiger0920

import Tiger0920.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0920")
    name = "Tiger0920"

    vcsRoot(Tiger0920_cVCSroot)
})
