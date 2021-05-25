package Tiger042

import Tiger042.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger042")
    name = "Tiger042"

    vcsRoot(Tiger042_cVCSroot)
})
