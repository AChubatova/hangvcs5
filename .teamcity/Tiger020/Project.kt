package Tiger020

import Tiger020.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger020")
    name = "Tiger020"

    vcsRoot(Tiger020_cVCSroot)
})
