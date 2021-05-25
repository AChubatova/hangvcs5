package Tiger0524

import Tiger0524.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0524")
    name = "Tiger0524"

    vcsRoot(Tiger0524_cVCSroot)
})
