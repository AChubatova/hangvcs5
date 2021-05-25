package Tiger0921

import Tiger0921.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0921")
    name = "Tiger0921"

    vcsRoot(Tiger0921_cVCSroot)
})
