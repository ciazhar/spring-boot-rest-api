package com.ciazhar.springrest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringRestApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringRestApplication::class.java, *args)
}
