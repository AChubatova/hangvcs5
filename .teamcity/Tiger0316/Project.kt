package Tiger0316

import Tiger0316.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0316")
    name = "Tiger0316"

    vcsRoot(Tiger0316_cVCSroot)
})
