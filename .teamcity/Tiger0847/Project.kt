package Tiger0847

import Tiger0847.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0847")
    name = "Tiger0847"

    vcsRoot(Tiger0847_cVCSroot)
})
