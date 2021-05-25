package Tiger0741

import Tiger0741.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0741")
    name = "Tiger0741"

    vcsRoot(Tiger0741_cVCSroot)
})
