package com.andyludeveloper.aut

class LogAnalyzer {
    fun isValidLogFileName(filename:String):Boolean{
        if(filename.endsWith(".SLF", true)){
            return true
        }else{
            return false
        }
    }
}