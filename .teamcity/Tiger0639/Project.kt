package Tiger0639

import Tiger0639.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0639")
    name = "Tiger0639"

    vcsRoot(Tiger0639_cVCSroot)
})
