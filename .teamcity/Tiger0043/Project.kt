package Tiger0043

import Tiger0043.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0043")
    name = "Tiger0043"

    vcsRoot(Tiger0043_cVCSroot)
})
