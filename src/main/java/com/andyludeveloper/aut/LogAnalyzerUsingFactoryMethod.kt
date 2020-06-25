package com.andyludeveloper.aut

open class LogAnalyzerUsingFactoryMethod {
    fun isValidLogFileName(filename:String):Boolean{
        return manager.isValid(filename)
    }

    var manager:IExtensionManager = FileExtensionManager()
}