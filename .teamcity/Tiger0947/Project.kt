package Tiger0947

import Tiger0947.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0947")
    name = "Tiger0947"

    vcsRoot(Tiger0947_cVCSroot)
})
