package Tiger083

import Tiger083.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger083")
    name = "Tiger083"

    vcsRoot(Tiger083_cVCSroot)
})
