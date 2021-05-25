package Tiger0611

import Tiger0611.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0611")
    name = "Tiger0611"

    vcsRoot(Tiger0611_cVCSroot)
})
