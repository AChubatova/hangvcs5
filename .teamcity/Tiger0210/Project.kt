package Tiger0210

import Tiger0210.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0210")
    name = "Tiger0210"

    vcsRoot(Tiger0210_cVCSroot)
})
