package com.github.summerchsj.ideaplugintest.services

import com.intellij.openapi.project.Project
import com.github.summerchsj.ideaplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
