package Tiger0410

import Tiger0410.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0410")
    name = "Tiger0410"

    vcsRoot(Tiger0410_cVCSroot)
})
