package Tiger0712

import Tiger0712.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0712")
    name = "Tiger0712"

    vcsRoot(Tiger0712_cVCSroot)
})
