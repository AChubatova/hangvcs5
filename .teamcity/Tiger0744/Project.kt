package Tiger0744

import Tiger0744.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0744")
    name = "Tiger0744"

    vcsRoot(Tiger0744_cVCSroot)
})
