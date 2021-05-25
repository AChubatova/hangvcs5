package Tiger0548

import Tiger0548.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0548")
    name = "Tiger0548"

    vcsRoot(Tiger0548_cVCSroot)
})
