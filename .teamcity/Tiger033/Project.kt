package Tiger033

import Tiger033.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger033")
    name = "Tiger033"

    vcsRoot(Tiger033_cVCSroot)
})
