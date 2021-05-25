package Tiger0520

import Tiger0520.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0520")
    name = "Tiger0520"

    vcsRoot(Tiger0520_cVCSroot)
})
