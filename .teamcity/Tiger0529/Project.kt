package Tiger0529

import Tiger0529.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0529")
    name = "Tiger0529"

    vcsRoot(Tiger0529_cVCSroot)
})
