package Tiger0443

import Tiger0443.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0443")
    name = "Tiger0443"

    vcsRoot(Tiger0443_cVCSroot)
})
