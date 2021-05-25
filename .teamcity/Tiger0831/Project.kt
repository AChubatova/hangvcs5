package Tiger0831

import Tiger0831.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0831")
    name = "Tiger0831"

    vcsRoot(Tiger0831_cVCSroot)
})
