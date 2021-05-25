package Tiger0939

import Tiger0939.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0939")
    name = "Tiger0939"

    vcsRoot(Tiger0939_cVCSroot)
})
