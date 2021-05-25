package Tiger0510

import Tiger0510.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0510")
    name = "Tiger0510"

    vcsRoot(Tiger0510_cVCSroot)
})
