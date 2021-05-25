package Tiger043

import Tiger043.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger043")
    name = "Tiger043"

    vcsRoot(Tiger043_cVCSroot)
})
