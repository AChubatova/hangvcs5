package Tiger0213

import Tiger0213.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0213")
    name = "Tiger0213"

    vcsRoot(Tiger0213_cVCSroot)
})
