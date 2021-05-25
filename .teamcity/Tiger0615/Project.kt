package Tiger0615

import Tiger0615.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0615")
    name = "Tiger0615"

    vcsRoot(Tiger0615_cVCSroot)
})
