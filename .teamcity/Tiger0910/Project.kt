package Tiger0910

import Tiger0910.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0910")
    name = "Tiger0910"

    vcsRoot(Tiger0910_cVCSroot)
})
