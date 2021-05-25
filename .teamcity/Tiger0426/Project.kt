package Tiger0426

import Tiger0426.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0426")
    name = "Tiger0426"

    vcsRoot(Tiger0426_cVCSroot)
})
