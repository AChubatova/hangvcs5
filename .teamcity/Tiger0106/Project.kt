package Tiger0106

import Tiger0106.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0106")
    name = "Tiger0106"

    vcsRoot(Tiger0106_cVCSroot)
})
