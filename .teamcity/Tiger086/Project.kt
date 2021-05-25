package Tiger086

import Tiger086.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger086")
    name = "Tiger086"

    vcsRoot(Tiger086_cVCSroot)
})
