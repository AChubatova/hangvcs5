package Tiger032

import Tiger032.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger032")
    name = "Tiger032"

    vcsRoot(Tiger032_cVCSroot)
})
