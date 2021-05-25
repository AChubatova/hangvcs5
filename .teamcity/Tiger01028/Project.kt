package Tiger01028

import Tiger01028.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01028")
    name = "Tiger01028"

    vcsRoot(Tiger01028_cVCSroot)
})
