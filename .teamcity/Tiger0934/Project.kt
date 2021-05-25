package Tiger0934

import Tiger0934.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0934")
    name = "Tiger0934"

    vcsRoot(Tiger0934_cVCSroot)
})
