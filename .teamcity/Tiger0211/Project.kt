package Tiger0211

import Tiger0211.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0211")
    name = "Tiger0211"

    vcsRoot(Tiger0211_cVCSroot)
})
