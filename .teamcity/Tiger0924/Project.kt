package Tiger0924

import Tiger0924.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0924")
    name = "Tiger0924"

    vcsRoot(Tiger0924_cVCSroot)
})
