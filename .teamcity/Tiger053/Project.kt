package Tiger053

import Tiger053.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger053")
    name = "Tiger053"

    vcsRoot(Tiger053_cVCSroot)
})
