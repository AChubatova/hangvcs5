package Tiger0517

import Tiger0517.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0517")
    name = "Tiger0517"

    vcsRoot(Tiger0517_cVCSroot)
})
