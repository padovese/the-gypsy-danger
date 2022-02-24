package com.gypsy.danger.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DangerController {

    @GetMapping("/gypsy")
    fun get() : String{
        return "danger"
    }

}