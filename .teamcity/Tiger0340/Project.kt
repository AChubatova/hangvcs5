package Tiger0340

import Tiger0340.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0340")
    name = "Tiger0340"

    vcsRoot(Tiger0340_cVCSroot)
})
