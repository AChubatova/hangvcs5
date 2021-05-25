package Tiger034

import Tiger034.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger034")
    name = "Tiger034"

    vcsRoot(Tiger034_cVCSroot)
})
