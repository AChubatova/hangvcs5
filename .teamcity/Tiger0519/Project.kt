package Tiger0519

import Tiger0519.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0519")
    name = "Tiger0519"

    vcsRoot(Tiger0519_cVCSroot)
})
