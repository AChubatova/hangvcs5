package Tiger0419

import Tiger0419.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0419")
    name = "Tiger0419"

    vcsRoot(Tiger0419_cVCSroot)
})
