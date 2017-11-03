package com.ciazhar.springrest.model

import java.util.*
import javax.validation.constraints.NotNull

/**
 * Created by ciazhar on 11/3/17.
 *
 * [ Documentation Here ]
 */

data class Person (
        @field:NotNull
        var name : String?=null,

        @field:NotNull
        var birthDate : Date?=null
){
    init {
        birthDate = Date()
    }
}