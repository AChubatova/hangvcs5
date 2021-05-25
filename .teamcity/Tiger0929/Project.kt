package Tiger0929

import Tiger0929.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0929")
    name = "Tiger0929"

    vcsRoot(Tiger0929_cVCSroot)
})
