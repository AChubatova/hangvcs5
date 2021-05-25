package Tiger0513

import Tiger0513.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0513")
    name = "Tiger0513"

    vcsRoot(Tiger0513_cVCSroot)
})
