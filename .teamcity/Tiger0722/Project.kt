package Tiger0722

import Tiger0722.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0722")
    name = "Tiger0722"

    vcsRoot(Tiger0722_cVCSroot)
})
