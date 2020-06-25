package com.andyludeveloper.aut

class FileExtensionManager : IExtensionManager {

    override fun isValid(filename:String?):Boolean{
        filename?:throw IllegalArgumentException("filename has to be provided")
        if(!filename.endsWith(".SLF", true)){
            return false
        }
        return true
    }
}