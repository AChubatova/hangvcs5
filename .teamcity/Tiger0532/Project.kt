package Tiger0532

import Tiger0532.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0532")
    name = "Tiger0532"

    vcsRoot(Tiger0532_cVCSroot)
})
