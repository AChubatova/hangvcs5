package Tiger0733

import Tiger0733.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0733")
    name = "Tiger0733"

    vcsRoot(Tiger0733_cVCSroot)
})
