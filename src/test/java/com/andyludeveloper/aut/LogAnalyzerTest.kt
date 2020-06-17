package com.andyludeveloper.aut

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertFailsWith


class LogAnalyzerTest{
    private lateinit var SUT : LogAnalyzer

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

    @Test
    fun isValidLogFileName_BadName_WasLastFileNameValid_Return_False() {
        givenFileName("badname.foo")
        shouldBe(false)
    }

    @Test
    fun isValidLogFileName_WhenCalled_WasLastFileNameValid_Return_True() {
        givenFileName("GoodName.SLF")
        shouldBe(true)
    }

    private fun shouldBe(result:Boolean) {
        assertThat(SUT.wasLastFileNameValid, `is`(result))
    }

    private fun givenFileName(filename: String) {
        SUT = LogAnalyzer()
        SUT.isValidLogFileName(filename)
    }
}