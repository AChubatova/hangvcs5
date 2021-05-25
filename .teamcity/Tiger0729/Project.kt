package Tiger0729

import Tiger0729.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0729")
    name = "Tiger0729"

    vcsRoot(Tiger0729_cVCSroot)
})
