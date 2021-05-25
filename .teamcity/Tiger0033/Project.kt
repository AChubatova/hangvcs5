package Tiger0033

import Tiger0033.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0033")
    name = "Tiger0033"

    vcsRoot(Tiger0033_cVCSroot)
})
