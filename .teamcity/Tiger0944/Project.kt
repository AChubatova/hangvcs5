package Tiger0944

import Tiger0944.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0944")
    name = "Tiger0944"

    vcsRoot(Tiger0944_cVCSroot)
})
