package Tiger0323

import Tiger0323.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0323")
    name = "Tiger0323"

    vcsRoot(Tiger0323_cVCSroot)
})
