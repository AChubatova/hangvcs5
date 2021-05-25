package Tiger0629

import Tiger0629.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0629")
    name = "Tiger0629"

    vcsRoot(Tiger0629_cVCSroot)
})
