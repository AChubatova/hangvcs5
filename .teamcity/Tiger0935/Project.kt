package Tiger0935

import Tiger0935.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0935")
    name = "Tiger0935"

    vcsRoot(Tiger0935_cVCSroot)
})
