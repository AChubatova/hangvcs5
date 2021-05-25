package Tiger0610

import Tiger0610.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0610")
    name = "Tiger0610"

    vcsRoot(Tiger0610_cVCSroot)
})
