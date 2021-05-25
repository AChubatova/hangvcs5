package Tiger0327

import Tiger0327.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0327")
    name = "Tiger0327"

    vcsRoot(Tiger0327_cVCSroot)
})
