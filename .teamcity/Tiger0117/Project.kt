package Tiger0117

import Tiger0117.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0117")
    name = "Tiger0117"

    vcsRoot(Tiger0117_cVCSroot)
})
