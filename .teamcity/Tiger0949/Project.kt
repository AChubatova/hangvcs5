package Tiger0949

import Tiger0949.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0949")
    name = "Tiger0949"

    vcsRoot(Tiger0949_cVCSroot)
})
