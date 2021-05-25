package Tiger0314

import Tiger0314.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0314")
    name = "Tiger0314"

    vcsRoot(Tiger0314_cVCSroot)
})
