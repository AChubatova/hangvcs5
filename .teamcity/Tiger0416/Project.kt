package Tiger0416

import Tiger0416.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0416")
    name = "Tiger0416"

    vcsRoot(Tiger0416_cVCSroot)
})
