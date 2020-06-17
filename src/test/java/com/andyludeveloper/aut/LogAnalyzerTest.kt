package com.andyludeveloper.aut

import org.junit.Assert.assertTrue
import org.junit.Test


class LogAnalyzerTest{
    @Test
    fun isValidLogFileName_GoodExtensionLowercase_ReturnTrue() {
        val SUT = LogAnalyzer()
        val result = SUT.isValidLogFileName("filewithgoodextension.slf")
        assertTrue(result)
    }

    @Test
    fun isValidLogFileName_GoodExtensionUppercase_ReturnTrue() {
        val SUT = LogAnalyzer()
        val result = SUT.isValidLogFileName("filewithgoodextension.SLF")
        assertTrue(result)
    }
}