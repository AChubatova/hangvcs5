package Tiger0915

import Tiger0915.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0915")
    name = "Tiger0915"

    vcsRoot(Tiger0915_cVCSroot)
})
