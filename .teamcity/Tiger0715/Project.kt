package Tiger0715

import Tiger0715.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0715")
    name = "Tiger0715"

    vcsRoot(Tiger0715_cVCSroot)
})
