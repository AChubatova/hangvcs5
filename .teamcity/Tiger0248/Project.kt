package Tiger0248

import Tiger0248.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0248")
    name = "Tiger0248"

    vcsRoot(Tiger0248_cVCSroot)
})
