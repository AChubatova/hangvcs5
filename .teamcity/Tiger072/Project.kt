package Tiger072

import Tiger072.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger072")
    name = "Tiger072"

    vcsRoot(Tiger072_cVCSroot)
})
