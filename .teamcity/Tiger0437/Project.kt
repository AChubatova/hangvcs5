package Tiger0437

import Tiger0437.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0437")
    name = "Tiger0437"

    vcsRoot(Tiger0437_cVCSroot)
})
