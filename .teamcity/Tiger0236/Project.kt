package Tiger0236

import Tiger0236.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0236")
    name = "Tiger0236"

    vcsRoot(Tiger0236_cVCSroot)
})
