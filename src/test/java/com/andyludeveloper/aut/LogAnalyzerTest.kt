package com.andyludeveloper.aut

import org.junit.Assert.*
import org.junit.Test

class LogAnalyzerTest{

    @Test
    fun isValidFileName_NameSupportedExtension_ReturnsTrue(){
        val manager = FakeValidFakeExtensionManager()
        manager.valid = true
        val SUT = LogAnalyzer(manager)
        val result =SUT.isValidLogFileName("short.ext")
        assertTrue(result)
    }
    @Test
    fun isValidFileName_NameSupportedExtension_add_property_ReturnsTrue(){
        val manager = FakeValidFakeExtensionManager()
        manager.valid = true
        val SUT = LogAnalyzer()
        SUT.manager = manager
        val result =SUT.isValidLogFileName("short.ext")
        assertTrue(result)
    }

    internal class FakeValidFakeExtensionManager : IExtensionManager{
        var valid = false
        override fun isValid(filename: String?): Boolean = valid
    }
}
