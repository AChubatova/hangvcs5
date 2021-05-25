package Tiger069

import Tiger069.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger069")
    name = "Tiger069"

    vcsRoot(Tiger069_cVCSroot)
})
