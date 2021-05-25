package Tiger019

import Tiger019.buildTypes.*
import Tiger019.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger019")
    name = "Tiger019"

    vcsRoot(Tiger019_cVCSroot)

    buildType(Tiger019_Hi0)
    buildType(Tiger019_Hi2)
    buildType(Tiger019_Hi1)
    buildType(Tiger019_Hi3)

    subProject(Tiger01926.Project)
    subProject(Tiger01925.Project)
    subProject(Tiger01928.Project)
    subProject(Tiger01927.Project)
    subProject(Tiger01922.Project)
    subProject(Tiger01921.Project)
    subProject(Tiger01924.Project)
    subProject(Tiger01923.Project)
    subProject(Tiger01920.Project)
    subProject(Tiger01919.Project)
    subProject(Tiger01918.Project)
    subProject(Tiger01937.Project)
    subProject(Tiger01936.Project)
    subProject(Tiger01939.Project)
    subProject(Tiger01938.Project)
    subProject(Tiger01933.Project)
    subProject(Tiger01932.Project)
    subProject(Tiger01935.Project)
    subProject(Tiger01934.Project)
    subProject(Tiger0199.Project)
    subProject(Tiger01931.Project)
    subProject(Tiger01930.Project)
    subProject(Tiger01929.Project)
    subProject(Tiger01948.Project)
    subProject(Tiger01947.Project)
    subProject(Tiger01949.Project)
    subProject(Tiger01944.Project)
    subProject(Tiger01943.Project)
    subProject(Tiger01946.Project)
    subProject(Tiger01945.Project)
    subProject(Tiger01940.Project)
    subProject(Tiger01942.Project)
    subProject(Tiger01941.Project)
    subProject(Tiger0191.Project)
    subProject(Tiger0192.Project)
    subProject(Tiger0193.Project)
    subProject(Tiger0194.Project)
    subProject(Tiger0195.Project)
    subProject(Tiger0196.Project)
    subProject(Tiger0197.Project)
    subProject(Tiger0198.Project)
    subProject(Tiger0190.Project)
    subProject(Tiger01915.Project)
    subProject(Tiger01914.Project)
    subProject(Tiger01917.Project)
    subProject(Tiger01916.Project)
    subProject(Tiger01911.Project)
    subProject(Tiger01910.Project)
    subProject(Tiger01913.Project)
    subProject(Tiger01912.Project)
})
