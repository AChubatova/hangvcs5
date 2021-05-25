package Tiger0536

import Tiger0536.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0536")
    name = "Tiger0536"

    vcsRoot(Tiger0536_cVCSroot)
})
