package Tiger051

import Tiger051.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger051")
    name = "Tiger051"

    vcsRoot(Tiger051_cVCSroot)
})
