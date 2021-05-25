package Tiger0102

import Tiger0102.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0102")
    name = "Tiger0102"

    vcsRoot(Tiger0102_cVCSroot)
})
