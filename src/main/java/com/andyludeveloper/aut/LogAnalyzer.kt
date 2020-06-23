package com.andyludeveloper.aut

import java.lang.IllegalArgumentException

class LogAnalyzer {
    fun isValidLogFileName(filename:String?):Boolean{
        filename?:throw IllegalArgumentException("filename has to be provided")
        if(!filename.endsWith(".SLF", true)){
            return false
        }
        return true
    }
}