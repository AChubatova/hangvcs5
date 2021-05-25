package Tiger0538

import Tiger0538.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0538")
    name = "Tiger0538"

    vcsRoot(Tiger0538_cVCSroot)
})
