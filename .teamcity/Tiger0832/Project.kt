package Tiger0832

import Tiger0832.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0832")
    name = "Tiger0832"

    vcsRoot(Tiger0832_cVCSroot)
})
