package Tiger0543

import Tiger0543.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0543")
    name = "Tiger0543"

    vcsRoot(Tiger0543_cVCSroot)
})
