package Tiger0427

import Tiger0427.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0427")
    name = "Tiger0427"

    vcsRoot(Tiger0427_cVCSroot)
})
