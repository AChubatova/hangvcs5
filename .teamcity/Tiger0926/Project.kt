package Tiger0926

import Tiger0926.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0926")
    name = "Tiger0926"

    vcsRoot(Tiger0926_cVCSroot)
})
