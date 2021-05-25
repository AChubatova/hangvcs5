package Tiger0349

import Tiger0349.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0349")
    name = "Tiger0349"

    vcsRoot(Tiger0349_cVCSroot)
})
