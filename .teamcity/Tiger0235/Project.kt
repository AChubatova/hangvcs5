package Tiger0235

import Tiger0235.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0235")
    name = "Tiger0235"

    vcsRoot(Tiger0235_cVCSroot)
})
