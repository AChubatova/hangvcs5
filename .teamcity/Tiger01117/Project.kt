package Tiger01117

import Tiger01117.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01117")
    name = "Tiger01117"

    vcsRoot(Tiger01117_cVCSroot)
})
