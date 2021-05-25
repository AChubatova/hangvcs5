package Tiger0522

import Tiger0522.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0522")
    name = "Tiger0522"

    vcsRoot(Tiger0522_cVCSroot)
})
