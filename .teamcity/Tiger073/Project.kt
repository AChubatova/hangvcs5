package Tiger073

import Tiger073.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger073")
    name = "Tiger073"

    vcsRoot(Tiger073_cVCSroot)
})
