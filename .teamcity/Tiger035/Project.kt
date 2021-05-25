package Tiger035

import Tiger035.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger035")
    name = "Tiger035"

    vcsRoot(Tiger035_cVCSroot)
})
