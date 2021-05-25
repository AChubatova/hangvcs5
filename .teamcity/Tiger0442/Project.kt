package Tiger0442

import Tiger0442.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0442")
    name = "Tiger0442"

    vcsRoot(Tiger0442_cVCSroot)
})
