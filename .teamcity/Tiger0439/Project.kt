package Tiger0439

import Tiger0439.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0439")
    name = "Tiger0439"

    vcsRoot(Tiger0439_cVCSroot)
})
