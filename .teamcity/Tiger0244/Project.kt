package Tiger0244

import Tiger0244.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0244")
    name = "Tiger0244"

    vcsRoot(Tiger0244_cVCSroot)
})
