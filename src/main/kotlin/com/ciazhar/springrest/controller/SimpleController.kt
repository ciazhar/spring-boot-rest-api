package com.ciazhar.springrest.controller

import com.ciazhar.springrest.model.Person
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * Created by ciazhar on 11/3/17.
 *
 * [ Documentation Here ]
 */

@RestController
class SimpleController{

    @GetMapping("/simple")
    fun simple():String{
        return "This is simple String"
    }

    @GetMapping("/param")
    fun param(@RequestParam name : String):String{
        return "hello $name"
    }

    @GetMapping("/path/{tool}")
    fun path(@PathVariable tool : String):String{
        return "$tool is tool"
    }

    @PostMapping("/person")
    fun person(@Valid @RequestBody person : Person) : String{
        return person.toString()
    }
}

