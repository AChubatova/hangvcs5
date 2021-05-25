package Tiger0743

import Tiger0743.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0743")
    name = "Tiger0743"

    vcsRoot(Tiger0743_cVCSroot)
})
