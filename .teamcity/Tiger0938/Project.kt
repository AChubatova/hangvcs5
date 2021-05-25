package Tiger0938

import Tiger0938.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0938")
    name = "Tiger0938"

    vcsRoot(Tiger0938_cVCSroot)
})
