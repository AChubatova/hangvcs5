package Tiger01049

import Tiger01049.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01049")
    name = "Tiger01049"

    vcsRoot(Tiger01049_cVCSroot)
})
