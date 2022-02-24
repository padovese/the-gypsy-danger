package com.gypsy.danger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DangerApplication

fun main(args: Array<String>) {
	runApplication<DangerApplication>(*args)
}
