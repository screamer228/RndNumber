package com.example.randomnumber

class Generator(private val number1: String,
                private val number2: String) {

    fun checkRequire(): Boolean {
        val num1Int = number1.toInt()
        val num2Int = number2.toInt()
        return num1Int <= num2Int
    }

    fun generate(): Int {
        val num1Int = number1.toInt()
        val num2Int = number2.toInt()
        return (num1Int..num2Int).random()
    }
}