package com.example.myapplication.ch3

import com.example.myapplication.test3.User
import com.example.myapplication.test3.data
import com.example.myapplication.test3.formatData
import java.util.*

fun main() {
    data = 20
    var saydate = formatData(Date())
    println(saydate)
    User().sayHello()
}