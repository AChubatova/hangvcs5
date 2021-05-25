package Tiger0328

import Tiger0328.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0328")
    name = "Tiger0328"

    vcsRoot(Tiger0328_cVCSroot)
})
