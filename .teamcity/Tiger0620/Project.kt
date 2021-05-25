package Tiger0620

import Tiger0620.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0620")
    name = "Tiger0620"

    vcsRoot(Tiger0620_cVCSroot)
})
