package Tiger01033

import Tiger01033.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01033")
    name = "Tiger01033"

    vcsRoot(Tiger01033_cVCSroot)
})
