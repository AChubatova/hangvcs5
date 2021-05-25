package Tiger01127

import Tiger01127.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01127")
    name = "Tiger01127"

    vcsRoot(Tiger01127_cVCSroot)
})
