package Tiger0240

import Tiger0240.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0240")
    name = "Tiger0240"

    vcsRoot(Tiger0240_cVCSroot)
})
