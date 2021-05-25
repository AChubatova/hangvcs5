package Tiger0038

import Tiger0038.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0038")
    name = "Tiger0038"

    vcsRoot(Tiger0038_cVCSroot)
})
