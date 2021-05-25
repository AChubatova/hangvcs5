package Tiger0635

import Tiger0635.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0635")
    name = "Tiger0635"

    vcsRoot(Tiger0635_cVCSroot)
})
