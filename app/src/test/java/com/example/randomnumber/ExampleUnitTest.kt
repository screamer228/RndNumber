package com.example.randomnumber

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun checkRequire_test() {
        val generator = Generator("1", "10")
        val actual = generator.checkRequire()
        val expected = true

        assertEquals(expected, actual)
    }
    @Test
    fun generate_test() {
        val editText1 = 1
        val editText2 = 10
        val userInput1 = editText1.toString()
        val userInput2 = editText2.toString()
        val generator = Generator(userInput1, userInput2)
        val result = generator.generate()

        //val actual = editText1 < result
        val actual = result < editText2
        val expected = true

        assertEquals(expected, actual)
    }
}