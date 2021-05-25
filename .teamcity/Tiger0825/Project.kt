package Tiger0825

import Tiger0825.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0825")
    name = "Tiger0825"

    vcsRoot(Tiger0825_cVCSroot)
})
