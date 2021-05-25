package Tiger01126

import Tiger01126.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01126")
    name = "Tiger01126"

    vcsRoot(Tiger01126_cVCSroot)
})
