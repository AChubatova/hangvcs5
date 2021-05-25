package Tiger078

import Tiger078.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger078")
    name = "Tiger078"

    vcsRoot(Tiger078_cVCSroot)
})
