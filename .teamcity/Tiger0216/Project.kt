package Tiger0216

import Tiger0216.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0216")
    name = "Tiger0216"

    vcsRoot(Tiger0216_cVCSroot)
})
