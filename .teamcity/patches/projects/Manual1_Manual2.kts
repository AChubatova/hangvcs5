package patches.projects

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a project with id = 'Manual1_Manual2'
in the project with id = 'Manual1', and delete the patch script.
*/
create(RelativeId("Manual1"), Project({
    id("Manual1_Manual2")
    name = "manual2"
}))

