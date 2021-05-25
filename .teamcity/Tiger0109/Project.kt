package Tiger0109

import Tiger0109.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0109")
    name = "Tiger0109"

    vcsRoot(Tiger0109_cVCSroot)
})
