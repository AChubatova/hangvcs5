package Tiger0748

import Tiger0748.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0748")
    name = "Tiger0748"

    vcsRoot(Tiger0748_cVCSroot)
})
