package Tiger0449

import Tiger0449.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0449")
    name = "Tiger0449"

    vcsRoot(Tiger0449_cVCSroot)
})
