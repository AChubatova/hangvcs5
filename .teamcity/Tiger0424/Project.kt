package Tiger0424

import Tiger0424.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0424")
    name = "Tiger0424"

    vcsRoot(Tiger0424_cVCSroot)
})
