package com.example.demo.config

interface ExperimentalApiReleaseToggle {
    fun assertReleased()
}

class NotFoundException: RuntimeException()

class ReleaseExperimentalApi : ExperimentalApiReleaseToggle {
    override fun assertReleased() {}
}

class NotReleaseExperimentalApi : ExperimentalApiReleaseToggle {
    override fun assertReleased() {
        throw  NotFoundException()
    }
}
