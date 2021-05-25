package Tiger0836

import Tiger0836.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0836")
    name = "Tiger0836"

    vcsRoot(Tiger0836_cVCSroot)
})
