package Tiger0438

import Tiger0438.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0438")
    name = "Tiger0438"

    vcsRoot(Tiger0438_cVCSroot)
})
