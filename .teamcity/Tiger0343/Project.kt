package Tiger0343

import Tiger0343.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0343")
    name = "Tiger0343"

    vcsRoot(Tiger0343_cVCSroot)
})
