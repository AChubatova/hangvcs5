package Manualproj.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Manualproj_HttpsGithubComAChubatovaComposite : GitVcsRoot({
    name = "https://github.com/AChubatova/composite"
    url = "https://github.com/AChubatova/composite"
    branch = "refs/heads/master"
    authMethod = password {
    }
})
