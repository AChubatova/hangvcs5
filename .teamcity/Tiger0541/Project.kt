package Tiger0541

import Tiger0541.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0541")
    name = "Tiger0541"

    vcsRoot(Tiger0541_cVCSroot)
})
