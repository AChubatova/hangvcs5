package Tiger0228

import Tiger0228.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0228")
    name = "Tiger0228"

    vcsRoot(Tiger0228_cVCSroot)
})
