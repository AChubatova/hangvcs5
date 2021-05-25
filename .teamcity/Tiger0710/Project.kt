package Tiger0710

import Tiger0710.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0710")
    name = "Tiger0710"

    vcsRoot(Tiger0710_cVCSroot)
})
