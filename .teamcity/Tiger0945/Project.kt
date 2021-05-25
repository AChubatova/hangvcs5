package Tiger0945

import Tiger0945.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0945")
    name = "Tiger0945"

    vcsRoot(Tiger0945_cVCSroot)
})
