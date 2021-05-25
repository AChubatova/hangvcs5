package Tiger0214

import Tiger0214.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0214")
    name = "Tiger0214"

    vcsRoot(Tiger0214_cVCSroot)
})
