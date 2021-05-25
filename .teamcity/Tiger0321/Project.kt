package Tiger0321

import Tiger0321.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0321")
    name = "Tiger0321"

    vcsRoot(Tiger0321_cVCSroot)
})
