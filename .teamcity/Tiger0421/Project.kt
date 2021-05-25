package Tiger0421

import Tiger0421.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0421")
    name = "Tiger0421"

    vcsRoot(Tiger0421_cVCSroot)
})
