package com.andyludeveloper.aut

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*
import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertFailsWith


class LogAnalyzerTest{

    internal class AlwaysValidFakeExtensionManager : IExtensionManager{
        override fun isValid(filename: String?): Boolean = true
    }
}
