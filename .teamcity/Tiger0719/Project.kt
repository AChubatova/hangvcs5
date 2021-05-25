package Tiger0719

import Tiger0719.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0719")
    name = "Tiger0719"

    vcsRoot(Tiger0719_cVCSroot)
})
