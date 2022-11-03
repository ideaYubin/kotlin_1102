package com.example.myapplication.test3

import java.text.SimpleDateFormat
import java.util.*


var data = 10

fun formatData(date: Date): String {
    val sdformat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
    return sdformat.format(date)
}

class User {
    var name = "hello"

    fun sayHello() {
        println("name : $name")
    }
}