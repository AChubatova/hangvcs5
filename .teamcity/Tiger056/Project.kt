package Tiger056

import Tiger056.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger056")
    name = "Tiger056"

    vcsRoot(Tiger056_cVCSroot)
})
