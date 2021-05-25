package Tiger0315

import Tiger0315.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0315")
    name = "Tiger0315"

    vcsRoot(Tiger0315_cVCSroot)
})
