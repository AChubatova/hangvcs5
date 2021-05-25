package Tiger0313

import Tiger0313.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0313")
    name = "Tiger0313"

    vcsRoot(Tiger0313_cVCSroot)
})
