package Tiger01040

import Tiger01040.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01040")
    name = "Tiger01040"

    vcsRoot(Tiger01040_cVCSroot)
})
