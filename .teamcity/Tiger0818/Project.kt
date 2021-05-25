package Tiger0818

import Tiger0818.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0818")
    name = "Tiger0818"

    vcsRoot(Tiger0818_cVCSroot)
})
