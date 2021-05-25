package Tiger0411

import Tiger0411.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0411")
    name = "Tiger0411"

    vcsRoot(Tiger0411_cVCSroot)
})
