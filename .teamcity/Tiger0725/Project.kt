package Tiger0725

import Tiger0725.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0725")
    name = "Tiger0725"

    vcsRoot(Tiger0725_cVCSroot)
})
