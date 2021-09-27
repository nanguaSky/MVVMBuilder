package com.github.nanguasky.mvvmbuilder.services

import com.intellij.openapi.project.Project
import com.github.nanguasky.mvvmbuilder.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
