package Tiger01011

import Tiger01011.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01011")
    name = "Tiger01011"

    vcsRoot(Tiger01011_cVCSroot)
})
