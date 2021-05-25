package Tiger0446

import Tiger0446.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0446")
    name = "Tiger0446"

    vcsRoot(Tiger0446_cVCSroot)
})
