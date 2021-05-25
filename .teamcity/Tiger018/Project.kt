package Tiger018

import Tiger018.buildTypes.*
import Tiger018.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger018")
    name = "Tiger018"

    vcsRoot(Tiger018_cVCSroot)

    buildType(Tiger018_Hi3)
    buildType(Tiger018_Hi2)
    buildType(Tiger018_Hi1)
    buildType(Tiger018_Hi0)

    subProject(Tiger01849.Project)
    subProject(Tiger01848.Project)
    subProject(Tiger01845.Project)
    subProject(Tiger01844.Project)
    subProject(Tiger01847.Project)
    subProject(Tiger01846.Project)
    subProject(Tiger01841.Project)
    subProject(Tiger01840.Project)
    subProject(Tiger01843.Project)
    subProject(Tiger01842.Project)
    subProject(Tiger01816.Project)
    subProject(Tiger01815.Project)
    subProject(Tiger01818.Project)
    subProject(Tiger01817.Project)
    subProject(Tiger01812.Project)
    subProject(Tiger01811.Project)
    subProject(Tiger01814.Project)
    subProject(Tiger01813.Project)
    subProject(Tiger01810.Project)
    subProject(Tiger01827.Project)
    subProject(Tiger01826.Project)
    subProject(Tiger01829.Project)
    subProject(Tiger01828.Project)
    subProject(Tiger01823.Project)
    subProject(Tiger01822.Project)
    subProject(Tiger01825.Project)
    subProject(Tiger01824.Project)
    subProject(Tiger0188.Project)
    subProject(Tiger0189.Project)
    subProject(Tiger01821.Project)
    subProject(Tiger01820.Project)
    subProject(Tiger01819.Project)
    subProject(Tiger01838.Project)
    subProject(Tiger01837.Project)
    subProject(Tiger01839.Project)
    subProject(Tiger01834.Project)
    subProject(Tiger01833.Project)
    subProject(Tiger01836.Project)
    subProject(Tiger01835.Project)
    subProject(Tiger01830.Project)
    subProject(Tiger01832.Project)
    subProject(Tiger01831.Project)
    subProject(Tiger0180.Project)
    subProject(Tiger0181.Project)
    subProject(Tiger0182.Project)
    subProject(Tiger0183.Project)
    subProject(Tiger0184.Project)
    subProject(Tiger0185.Project)
    subProject(Tiger0186.Project)
    subProject(Tiger0187.Project)
})
