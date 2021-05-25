package Tiger036

import Tiger036.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger036")
    name = "Tiger036"

    vcsRoot(Tiger036_cVCSroot)
})
