package Tiger0547

import Tiger0547.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0547")
    name = "Tiger0547"

    vcsRoot(Tiger0547_cVCSroot)
})
