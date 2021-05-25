package Tiger0238

import Tiger0238.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0238")
    name = "Tiger0238"

    vcsRoot(Tiger0238_cVCSroot)
})
