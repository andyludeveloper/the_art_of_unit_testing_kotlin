package com.andyludeveloper.aut

import org.junit.Test

import org.junit.Assert.*

class MemCalculatorTest {

    @Test
    fun sum_ByDefault_Return0() {
        val SUT = MemCalculator()
        val result = SUT.sum()
        assertEquals(0 ,result)
    }
    @Test
    fun add_WhenCalled_ChangesSum() {
        val SUT = MemCalculator()
        SUT.add(1)
        val result = SUT.sum()
        assertEquals(1 ,result)
    }


}