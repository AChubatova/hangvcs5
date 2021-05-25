package Tiger097

import Tiger097.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger097")
    name = "Tiger097"

    vcsRoot(Tiger097_cVCSroot)
})
