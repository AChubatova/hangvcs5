package Tiger01032

import Tiger01032.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01032")
    name = "Tiger01032"

    vcsRoot(Tiger01032_cVCSroot)
})
