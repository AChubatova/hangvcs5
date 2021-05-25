package Tiger0535

import Tiger0535.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0535")
    name = "Tiger0535"

    vcsRoot(Tiger0535_cVCSroot)
})
