package Tiger0045

import Tiger0045.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0045")
    name = "Tiger0045"

    vcsRoot(Tiger0045_cVCSroot)
})
