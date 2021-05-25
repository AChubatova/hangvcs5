package Tiger0036

import Tiger0036.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0036")
    name = "Tiger0036"

    vcsRoot(Tiger0036_cVCSroot)
})
