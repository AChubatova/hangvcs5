package Tiger0728

import Tiger0728.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0728")
    name = "Tiger0728"

    vcsRoot(Tiger0728_cVCSroot)
})
