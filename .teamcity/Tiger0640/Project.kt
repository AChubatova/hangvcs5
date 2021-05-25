package Tiger0640

import Tiger0640.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0640")
    name = "Tiger0640"

    vcsRoot(Tiger0640_cVCSroot)
})
