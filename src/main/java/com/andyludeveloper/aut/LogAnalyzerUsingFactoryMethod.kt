package com.andyludeveloper.aut

open class LogAnalyzerUsingFactoryMethod {
    fun isValidLogFileName(filename:String):Boolean{
        return this.isValid(filename)
    }
    open fun isValid(filename:String): Boolean {
        val manager = FileExtensionManager()
        return manager.isValid(filename)
    }
}