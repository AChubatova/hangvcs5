package Tiger0622

import Tiger0622.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0622")
    name = "Tiger0622"

    vcsRoot(Tiger0622_cVCSroot)
})
