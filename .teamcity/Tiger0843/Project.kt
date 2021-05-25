package Tiger0843

import Tiger0843.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0843")
    name = "Tiger0843"

    vcsRoot(Tiger0843_cVCSroot)
})
