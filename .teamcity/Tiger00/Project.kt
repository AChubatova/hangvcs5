package Tiger00

import Tiger00.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger00")
    name = "Tiger00"

    buildType(Tiger00_Hi0)
    buildType(Tiger00_Hi2)
    buildType(Tiger00_Hi1)
    buildType(Tiger00_Hi3)

    subProject(Tiger0045.Project)
    subProject(Tiger0046.Project)
    subProject(Tiger0047.Project)
    subProject(Tiger0048.Project)
    subProject(Tiger0049.Project)
    subProject(Tiger0010.Project)
    subProject(Tiger0011.Project)
    subProject(Tiger0034.Project)
    subProject(Tiger0035.Project)
    subProject(Tiger0036.Project)
    subProject(Tiger0037.Project)
    subProject(Tiger0038.Project)
    subProject(Tiger0039.Project)
    subProject(Tiger0040.Project)
    subProject(Tiger0041.Project)
    subProject(Tiger0042.Project)
    subProject(Tiger0043.Project)
    subProject(Tiger0044.Project)
    subProject(Tiger0023.Project)
    subProject(Tiger0024.Project)
    subProject(Tiger0025.Project)
    subProject(Tiger0026.Project)
    subProject(Tiger0027.Project)
    subProject(Tiger0028.Project)
    subProject(Tiger0029.Project)
    subProject(Tiger0030.Project)
    subProject(Tiger0031.Project)
    subProject(Tiger0032.Project)
    subProject(Tiger0033.Project)
    subProject(Tiger007.Project)
    subProject(Tiger008.Project)
    subProject(Tiger009.Project)
    subProject(Tiger0012.Project)
    subProject(Tiger000.Project)
    subProject(Tiger0013.Project)
    subProject(Tiger001.Project)
    subProject(Tiger0014.Project)
    subProject(Tiger0015.Project)
    subProject(Tiger002.Project)
    subProject(Tiger0016.Project)
    subProject(Tiger003.Project)
    subProject(Tiger0017.Project)
    subProject(Tiger004.Project)
    subProject(Tiger0018.Project)
    subProject(Tiger005.Project)
    subProject(Tiger0019.Project)
    subProject(Tiger006.Project)
    subProject(Tiger0020.Project)
    subProject(Tiger0021.Project)
    subProject(Tiger0022.Project)
})