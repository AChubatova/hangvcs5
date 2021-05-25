package Tiger0432

import Tiger0432.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0432")
    name = "Tiger0432"

    vcsRoot(Tiger0432_cVCSroot)
})
