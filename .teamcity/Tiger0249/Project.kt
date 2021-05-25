package Tiger0249

import Tiger0249.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0249")
    name = "Tiger0249"

    vcsRoot(Tiger0249_cVCSroot)
})
