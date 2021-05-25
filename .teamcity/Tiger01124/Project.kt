package Tiger01124

import Tiger01124.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01124")
    name = "Tiger01124"

    vcsRoot(Tiger01124_cVCSroot)
})
