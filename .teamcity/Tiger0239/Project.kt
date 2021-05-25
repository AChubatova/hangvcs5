package Tiger0239

import Tiger0239.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0239")
    name = "Tiger0239"

    vcsRoot(Tiger0239_cVCSroot)
})
