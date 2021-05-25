package Tiger037

import Tiger037.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger037")
    name = "Tiger037"

    vcsRoot(Tiger037_cVCSroot)
})
