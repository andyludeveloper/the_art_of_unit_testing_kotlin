package com.andyludeveloper.aut

import org.junit.Test

import org.junit.Assert.*

class MemCalculatorTest {
    private val SUT = MemCalculator()

    @Test
    fun sum_ByDefault_Return0() {
        val result = SUT.sum()
        assertEquals(0 ,result)
    }
    @Test
    fun add_WhenCalled_ChangesSum() {
        SUT.add(1)
        val result = SUT.sum()
        assertEquals(1 ,result)
    }

    @Test
    fun add_Input2_Return2() {
        SUT.add(2)
        val result = SUT.sum()
        assertEquals(2 ,result)
    }

}