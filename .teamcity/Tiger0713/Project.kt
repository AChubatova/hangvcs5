package Tiger0713

import Tiger0713.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0713")
    name = "Tiger0713"

    vcsRoot(Tiger0713_cVCSroot)
})
