package Tiger0537

import Tiger0537.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0537")
    name = "Tiger0537"

    vcsRoot(Tiger0537_cVCSroot)
})
