package Tiger0813

import Tiger0813.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0813")
    name = "Tiger0813"

    vcsRoot(Tiger0813_cVCSroot)
})
