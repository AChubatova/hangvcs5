package Tiger0646

import Tiger0646.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0646")
    name = "Tiger0646"

    vcsRoot(Tiger0646_cVCSroot)
})
