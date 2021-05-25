package Tiger01038

import Tiger01038.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01038")
    name = "Tiger01038"

    vcsRoot(Tiger01038_cVCSroot)
})
