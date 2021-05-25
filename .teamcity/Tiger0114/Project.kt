package Tiger0114

import Tiger0114.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0114")
    name = "Tiger0114"

    vcsRoot(Tiger0114_cVCSroot)
})
