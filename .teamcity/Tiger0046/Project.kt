package Tiger0046

import Tiger0046.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0046")
    name = "Tiger0046"

    vcsRoot(Tiger0046_cVCSroot)
})
