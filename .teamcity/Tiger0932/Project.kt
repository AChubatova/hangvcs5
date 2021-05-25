package Tiger0932

import Tiger0932.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0932")
    name = "Tiger0932"

    vcsRoot(Tiger0932_cVCSroot)
})
