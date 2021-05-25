package Tiger01137

import Tiger01137.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01137")
    name = "Tiger01137"

    vcsRoot(Tiger01137_cVCSroot)
})
