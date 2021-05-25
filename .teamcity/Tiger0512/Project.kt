package Tiger0512

import Tiger0512.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0512")
    name = "Tiger0512"

    vcsRoot(Tiger0512_cVCSroot)
})
