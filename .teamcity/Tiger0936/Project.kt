package Tiger0936

import Tiger0936.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0936")
    name = "Tiger0936"

    vcsRoot(Tiger0936_cVCSroot)
})
