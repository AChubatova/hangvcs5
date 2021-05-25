package Tiger01116

import Tiger01116.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01116")
    name = "Tiger01116"

    vcsRoot(Tiger01116_cVCSroot)
})
