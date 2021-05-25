package Tiger0119

import Tiger0119.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0119")
    name = "Tiger0119"

    vcsRoot(Tiger0119_cVCSroot)
})
