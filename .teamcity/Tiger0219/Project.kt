package Tiger0219

import Tiger0219.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0219")
    name = "Tiger0219"

    vcsRoot(Tiger0219_cVCSroot)
})
