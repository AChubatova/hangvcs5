package Tiger0735

import Tiger0735.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0735")
    name = "Tiger0735"

    vcsRoot(Tiger0735_cVCSroot)
})
