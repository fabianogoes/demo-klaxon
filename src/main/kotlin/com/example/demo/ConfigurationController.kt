package com.example.demo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/configuration")
class ConfigurationController {

    @GetMapping
    fun get() = "Welcome"

    @PostMapping
    fun post(@RequestBody data: Data): Data? {
        return data
    }
}