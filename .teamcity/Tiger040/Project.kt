package Tiger040

import Tiger040.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger040")
    name = "Tiger040"

    vcsRoot(Tiger040_cVCSroot)
})
