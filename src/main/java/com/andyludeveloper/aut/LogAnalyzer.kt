package com.andyludeveloper.aut

class LogAnalyzer {
    fun isValidLogFileName(filename:String?):Boolean{
        val manager:IExtensionManager = FileExtensionManager()
        return manager.isValid(filename)
    }
}