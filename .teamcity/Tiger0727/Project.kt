package Tiger0727

import Tiger0727.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0727")
    name = "Tiger0727"

    vcsRoot(Tiger0727_cVCSroot)
})
