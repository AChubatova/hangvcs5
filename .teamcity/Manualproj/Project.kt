package Manualproj

import Manualproj.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Manualproj")
    name = "manualproj"

    vcsRoot(Manualproj_HttpsGithubComAChubatovaComposite)
})
