package Tiger0845

import Tiger0845.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0845")
    name = "Tiger0845"

    vcsRoot(Tiger0845_cVCSroot)
})
