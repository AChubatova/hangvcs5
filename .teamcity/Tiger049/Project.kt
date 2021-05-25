package Tiger049

import Tiger049.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger049")
    name = "Tiger049"

    vcsRoot(Tiger049_cVCSroot)
})
