package Tiger0040

import Tiger0040.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0040")
    name = "Tiger0040"

    vcsRoot(Tiger0040_cVCSroot)
})
