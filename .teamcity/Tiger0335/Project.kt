package Tiger0335

import Tiger0335.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0335")
    name = "Tiger0335"

    vcsRoot(Tiger0335_cVCSroot)
})
