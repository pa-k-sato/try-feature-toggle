package com.example.demo.controllers

import com.example.demo.config.ExperimentalApiReleaseToggle
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/experimental")
class ExperimentalController(
    private val toggle : ExperimentalApiReleaseToggle
) {
    @GetMapping("/tasks")
    fun getTasks(): String {
        toggle.assertReleased()
        return "experimental tasks"
    }
}

@RestController
@RequestMapping("/released")
class ReleasedController {
    @GetMapping("/tasks")
    fun getTasks(): String = "released tasks"
}