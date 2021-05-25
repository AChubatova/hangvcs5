package Tiger0227

import Tiger0227.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0227")
    name = "Tiger0227"

    vcsRoot(Tiger0227_cVCSroot)
})
