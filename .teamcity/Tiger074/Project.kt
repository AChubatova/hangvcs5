package Tiger074

import Tiger074.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger074")
    name = "Tiger074"

    vcsRoot(Tiger074_cVCSroot)
})
