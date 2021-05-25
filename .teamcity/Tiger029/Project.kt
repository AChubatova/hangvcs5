package Tiger029

import Tiger029.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger029")
    name = "Tiger029"

    vcsRoot(Tiger029_cVCSroot)
})
