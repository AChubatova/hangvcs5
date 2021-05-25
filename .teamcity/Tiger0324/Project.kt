package Tiger0324

import Tiger0324.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0324")
    name = "Tiger0324"

    vcsRoot(Tiger0324_cVCSroot)
})
