package Tiger0049

import Tiger0049.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0049")
    name = "Tiger0049"

    vcsRoot(Tiger0049_cVCSroot)
})
