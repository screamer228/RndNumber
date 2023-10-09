package com.example.randomnumber

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun checkRequire_test(){
        val generator = Generator("1","10")
        val actual = generator.checkRequire()
        val expected = true

        assertEquals(expected, actual)
    }
}