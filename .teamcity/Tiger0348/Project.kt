package Tiger0348

import Tiger0348.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0348")
    name = "Tiger0348"

    vcsRoot(Tiger0348_cVCSroot)
})
