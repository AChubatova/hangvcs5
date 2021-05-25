package Tiger0026

import Tiger0026.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0026")
    name = "Tiger0026"

    vcsRoot(Tiger0026_cVCSroot)
})
