package Tiger096

import Tiger096.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger096")
    name = "Tiger096"

    vcsRoot(Tiger096_cVCSroot)
})
