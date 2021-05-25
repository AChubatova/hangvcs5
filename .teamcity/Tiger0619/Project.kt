package Tiger0619

import Tiger0619.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0619")
    name = "Tiger0619"

    vcsRoot(Tiger0619_cVCSroot)
})
