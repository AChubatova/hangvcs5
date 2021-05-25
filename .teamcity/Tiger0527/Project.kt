package Tiger0527

import Tiger0527.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0527")
    name = "Tiger0527"

    vcsRoot(Tiger0527_cVCSroot)
})
