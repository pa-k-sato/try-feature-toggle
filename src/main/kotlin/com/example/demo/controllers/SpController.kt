package com.example.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/experimental")
class ExperimentalController {
    @GetMapping("/tasks")
    fun getTasks(): String = "experimental tasks"
}

@RestController
@RequestMapping("/released")
class ReleasedController {
    @GetMapping("/tasks")
    fun getTasks(): String = "released tasks"
}