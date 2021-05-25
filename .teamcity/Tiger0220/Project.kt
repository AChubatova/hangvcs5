package Tiger0220

import Tiger0220.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0220")
    name = "Tiger0220"

    vcsRoot(Tiger0220_cVCSroot)
})
