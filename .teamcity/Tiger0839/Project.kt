package Tiger0839

import Tiger0839.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0839")
    name = "Tiger0839"

    vcsRoot(Tiger0839_cVCSroot)
})
