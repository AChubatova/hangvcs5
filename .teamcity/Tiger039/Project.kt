package Tiger039

import Tiger039.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger039")
    name = "Tiger039"

    vcsRoot(Tiger039_cVCSroot)
})
