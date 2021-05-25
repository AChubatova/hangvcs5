package Tiger0731

import Tiger0731.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0731")
    name = "Tiger0731"

    vcsRoot(Tiger0731_cVCSroot)
})
