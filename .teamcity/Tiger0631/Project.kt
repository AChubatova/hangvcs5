package Tiger0631

import Tiger0631.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0631")
    name = "Tiger0631"

    vcsRoot(Tiger0631_cVCSroot)
})
