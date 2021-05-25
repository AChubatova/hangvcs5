package Tiger0342

import Tiger0342.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0342")
    name = "Tiger0342"

    vcsRoot(Tiger0342_cVCSroot)
})
