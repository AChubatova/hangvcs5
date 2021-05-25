package Tiger0819

import Tiger0819.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0819")
    name = "Tiger0819"

    vcsRoot(Tiger0819_cVCSroot)
})
