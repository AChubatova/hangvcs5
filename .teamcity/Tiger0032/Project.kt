package Tiger0032

import Tiger0032.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0032")
    name = "Tiger0032"

    vcsRoot(Tiger0032_cVCSroot)
})
