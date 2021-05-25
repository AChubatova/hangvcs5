package Tiger0540

import Tiger0540.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0540")
    name = "Tiger0540"

    vcsRoot(Tiger0540_cVCSroot)
})
