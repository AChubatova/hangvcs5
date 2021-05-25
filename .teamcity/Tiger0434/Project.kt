package Tiger0434

import Tiger0434.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0434")
    name = "Tiger0434"

    vcsRoot(Tiger0434_cVCSroot)
})
