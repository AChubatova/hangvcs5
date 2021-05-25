package Tiger0028

import Tiger0028.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0028")
    name = "Tiger0028"

    vcsRoot(Tiger0028_cVCSroot)
})
