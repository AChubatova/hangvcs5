package Tiger01136

import Tiger01136.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01136")
    name = "Tiger01136"

    vcsRoot(Tiger01136_cVCSroot)
})
