package Tiger048

import Tiger048.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger048")
    name = "Tiger048"

    vcsRoot(Tiger048_cVCSroot)
})
