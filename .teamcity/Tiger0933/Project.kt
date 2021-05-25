package Tiger0933

import Tiger0933.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0933")
    name = "Tiger0933"

    vcsRoot(Tiger0933_cVCSroot)
})
