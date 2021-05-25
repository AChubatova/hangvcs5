package Tiger0723

import Tiger0723.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0723")
    name = "Tiger0723"

    vcsRoot(Tiger0723_cVCSroot)
})
