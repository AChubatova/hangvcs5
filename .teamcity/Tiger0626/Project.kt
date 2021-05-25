package Tiger0626

import Tiger0626.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0626")
    name = "Tiger0626"

    vcsRoot(Tiger0626_cVCSroot)
})
