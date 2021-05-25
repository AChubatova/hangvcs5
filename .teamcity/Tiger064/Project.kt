package Tiger064

import Tiger064.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger064")
    name = "Tiger064"

    vcsRoot(Tiger064_cVCSroot)
})
