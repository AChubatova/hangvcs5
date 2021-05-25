package Tiger0337

import Tiger0337.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0337")
    name = "Tiger0337"

    vcsRoot(Tiger0337_cVCSroot)
})
