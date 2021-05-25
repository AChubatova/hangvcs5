package Tiger0319

import Tiger0319.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0319")
    name = "Tiger0319"

    vcsRoot(Tiger0319_cVCSroot)
})
