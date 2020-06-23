package com.andyludeveloper.aut

import java.lang.IllegalArgumentException

class LogAnalyzer {
    fun isValidLogFileName(filename:String?):Boolean{
        val manager:IFileExtensionManager = FileExtensionManager()
        return manager.isValid(filename)
    }
}