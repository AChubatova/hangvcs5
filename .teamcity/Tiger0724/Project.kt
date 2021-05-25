package Tiger0724

import Tiger0724.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0724")
    name = "Tiger0724"

    vcsRoot(Tiger0724_cVCSroot)
})
