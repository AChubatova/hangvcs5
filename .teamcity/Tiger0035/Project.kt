package Tiger0035

import Tiger0035.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0035")
    name = "Tiger0035"

    vcsRoot(Tiger0035_cVCSroot)
})
