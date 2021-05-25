package Tiger0916

import Tiger0916.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0916")
    name = "Tiger0916"

    vcsRoot(Tiger0916_cVCSroot)
})
