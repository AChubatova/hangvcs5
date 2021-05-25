package Tiger0647

import Tiger0647.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0647")
    name = "Tiger0647"

    vcsRoot(Tiger0647_cVCSroot)
})
