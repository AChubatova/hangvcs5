package Tiger0229

import Tiger0229.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0229")
    name = "Tiger0229"

    vcsRoot(Tiger0229_cVCSroot)
})
