package Tiger0232

import Tiger0232.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0232")
    name = "Tiger0232"

    vcsRoot(Tiger0232_cVCSroot)
})
