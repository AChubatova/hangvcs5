package Tiger0428

import Tiger0428.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0428")
    name = "Tiger0428"

    vcsRoot(Tiger0428_cVCSroot)
})
