package Tiger0632

import Tiger0632.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0632")
    name = "Tiger0632"

    vcsRoot(Tiger0632_cVCSroot)
})
