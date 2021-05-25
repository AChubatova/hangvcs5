package Tiger087

import Tiger087.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger087")
    name = "Tiger087"

    vcsRoot(Tiger087_cVCSroot)
})
