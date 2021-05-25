package Tiger0824

import Tiger0824.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0824")
    name = "Tiger0824"

    vcsRoot(Tiger0824_cVCSroot)
})
