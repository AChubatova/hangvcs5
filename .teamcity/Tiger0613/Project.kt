package Tiger0613

import Tiger0613.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0613")
    name = "Tiger0613"

    vcsRoot(Tiger0613_cVCSroot)
})
