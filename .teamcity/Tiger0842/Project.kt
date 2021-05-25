package Tiger0842

import Tiger0842.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0842")
    name = "Tiger0842"

    vcsRoot(Tiger0842_cVCSroot)
})
