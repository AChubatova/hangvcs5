package Tiger0638

import Tiger0638.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0638")
    name = "Tiger0638"

    vcsRoot(Tiger0638_cVCSroot)
})
