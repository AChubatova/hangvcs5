package Tiger0100

import Tiger0100.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0100")
    name = "Tiger0100"

    vcsRoot(Tiger0100_cVCSroot)
})
