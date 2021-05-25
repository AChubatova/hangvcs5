package Tiger093

import Tiger093.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger093")
    name = "Tiger093"

    vcsRoot(Tiger093_cVCSroot)
})
