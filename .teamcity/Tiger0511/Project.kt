package Tiger0511

import Tiger0511.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0511")
    name = "Tiger0511"

    vcsRoot(Tiger0511_cVCSroot)
})
