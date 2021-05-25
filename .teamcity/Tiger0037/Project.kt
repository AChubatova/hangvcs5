package Tiger0037

import Tiger0037.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0037")
    name = "Tiger0037"

    vcsRoot(Tiger0037_cVCSroot)
})
