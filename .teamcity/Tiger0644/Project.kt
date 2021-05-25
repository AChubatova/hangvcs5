package Tiger0644

import Tiger0644.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0644")
    name = "Tiger0644"

    vcsRoot(Tiger0644_cVCSroot)
})
