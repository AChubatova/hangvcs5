package Tiger01013

import Tiger01013.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01013")
    name = "Tiger01013"

    vcsRoot(Tiger01013_cVCSroot)
})
