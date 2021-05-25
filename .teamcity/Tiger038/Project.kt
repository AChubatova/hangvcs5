package Tiger038

import Tiger038.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger038")
    name = "Tiger038"

    vcsRoot(Tiger038_cVCSroot)
})
