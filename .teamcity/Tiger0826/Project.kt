package Tiger0826

import Tiger0826.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0826")
    name = "Tiger0826"

    vcsRoot(Tiger0826_cVCSroot)
})
