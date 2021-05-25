package Tiger0111

import Tiger0111.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0111")
    name = "Tiger0111"

    vcsRoot(Tiger0111_cVCSroot)
})
