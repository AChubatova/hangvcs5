package Tiger0925

import Tiger0925.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0925")
    name = "Tiger0925"

    vcsRoot(Tiger0925_cVCSroot)
})
