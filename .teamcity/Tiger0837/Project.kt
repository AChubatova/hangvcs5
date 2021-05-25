package Tiger0837

import Tiger0837.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0837")
    name = "Tiger0837"

    vcsRoot(Tiger0837_cVCSroot)
})
