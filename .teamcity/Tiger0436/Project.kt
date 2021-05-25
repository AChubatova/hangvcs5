package Tiger0436

import Tiger0436.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0436")
    name = "Tiger0436"

    vcsRoot(Tiger0436_cVCSroot)
})
