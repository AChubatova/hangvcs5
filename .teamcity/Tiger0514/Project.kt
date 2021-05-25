package Tiger0514

import Tiger0514.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0514")
    name = "Tiger0514"

    vcsRoot(Tiger0514_cVCSroot)
})
