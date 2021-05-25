package Tiger0218

import Tiger0218.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0218")
    name = "Tiger0218"

    vcsRoot(Tiger0218_cVCSroot)
})
