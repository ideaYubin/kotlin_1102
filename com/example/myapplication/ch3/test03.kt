package com.example.myapplication.ch3

fun main() {
    var a = 1
    val str1 = "a = $a"
    val str2 = "a = $(a + 2}"

    println("str1: \"$str1\", str2: \"$str2\"")
}