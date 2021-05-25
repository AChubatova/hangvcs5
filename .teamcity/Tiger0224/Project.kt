package Tiger0224

import Tiger0224.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0224")
    name = "Tiger0224"

    vcsRoot(Tiger0224_cVCSroot)
})
