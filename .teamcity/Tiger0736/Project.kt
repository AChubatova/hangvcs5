package Tiger0736

import Tiger0736.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0736")
    name = "Tiger0736"

    vcsRoot(Tiger0736_cVCSroot)
})
