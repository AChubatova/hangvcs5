package Tiger0104

import Tiger0104.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0104")
    name = "Tiger0104"

    vcsRoot(Tiger0104_cVCSroot)
})
