package Tiger01048

import Tiger01048.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01048")
    name = "Tiger01048"

    vcsRoot(Tiger01048_cVCSroot)
})
