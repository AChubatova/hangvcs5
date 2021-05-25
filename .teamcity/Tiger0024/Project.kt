package Tiger0024

import Tiger0024.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0024")
    name = "Tiger0024"

    vcsRoot(Tiger0024_cVCSroot)
})
