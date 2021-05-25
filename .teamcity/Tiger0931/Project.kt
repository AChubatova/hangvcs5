package Tiger0931

import Tiger0931.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0931")
    name = "Tiger0931"

    vcsRoot(Tiger0931_cVCSroot)
})
