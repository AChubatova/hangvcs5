package Tiger0526

import Tiger0526.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0526")
    name = "Tiger0526"

    vcsRoot(Tiger0526_cVCSroot)
})
