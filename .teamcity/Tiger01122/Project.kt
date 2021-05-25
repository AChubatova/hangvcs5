package Tiger01122

import Tiger01122.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01122")
    name = "Tiger01122"

    vcsRoot(Tiger01122_cVCSroot)
})
