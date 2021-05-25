package Tiger0922

import Tiger0922.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0922")
    name = "Tiger0922"

    vcsRoot(Tiger0922_cVCSroot)
})
