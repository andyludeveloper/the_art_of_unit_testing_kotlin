package com.andyludeveloper.aut

import java.lang.IllegalArgumentException

class LogAnalyzer {
    var wasLastFileNameValid:Boolean = false
    fun isValidLogFileName(filename:String?):Boolean{
        wasLastFileNameValid = false
        filename?:throw IllegalArgumentException("filename has to be provided")
        if(!filename.endsWith(".SLF", true)){
            return false
        }
        wasLastFileNameValid = true
        return true
    }
}