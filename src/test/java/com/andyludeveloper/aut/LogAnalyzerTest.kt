package com.andyludeveloper.aut

import org.junit.Assert.assertTrue
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertFailsWith


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

    @Test
    fun isValidLogFileName_NullFileName_Throws() {
        val SUT = LogAnalyzer()
        assertFailsWith<IllegalArgumentException> {
            SUT.isValidLogFileName(null)
        }
    }
}