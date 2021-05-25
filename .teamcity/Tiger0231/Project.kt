package Tiger0231

import Tiger0231.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0231")
    name = "Tiger0231"

    vcsRoot(Tiger0231_cVCSroot)
})
