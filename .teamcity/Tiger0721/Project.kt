package Tiger0721

import Tiger0721.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0721")
    name = "Tiger0721"

    vcsRoot(Tiger0721_cVCSroot)
})
