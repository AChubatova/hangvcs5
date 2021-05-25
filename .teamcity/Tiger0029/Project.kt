package Tiger0029

import Tiger0029.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0029")
    name = "Tiger0029"

    vcsRoot(Tiger0029_cVCSroot)
})
