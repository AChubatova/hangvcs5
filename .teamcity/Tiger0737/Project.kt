package Tiger0737

import Tiger0737.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0737")
    name = "Tiger0737"

    vcsRoot(Tiger0737_cVCSroot)
})
