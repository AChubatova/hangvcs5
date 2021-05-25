package Tiger0911

import Tiger0911.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0911")
    name = "Tiger0911"

    vcsRoot(Tiger0911_cVCSroot)
})
