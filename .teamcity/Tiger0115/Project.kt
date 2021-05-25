package Tiger0115

import Tiger0115.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0115")
    name = "Tiger0115"

    vcsRoot(Tiger0115_cVCSroot)
})
