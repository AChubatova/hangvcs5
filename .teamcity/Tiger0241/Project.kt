package Tiger0241

import Tiger0241.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0241")
    name = "Tiger0241"

    vcsRoot(Tiger0241_cVCSroot)
})
