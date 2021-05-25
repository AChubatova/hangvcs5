package Tiger0742

import Tiger0742.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0742")
    name = "Tiger0742"

    vcsRoot(Tiger0742_cVCSroot)
})
