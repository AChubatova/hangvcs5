package Tiger058

import Tiger058.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger058")
    name = "Tiger058"

    vcsRoot(Tiger058_cVCSroot)
})
