package com.andyludeveloper.aut

interface IFileExtensionManager {
    fun isValid(filename: String?): Boolean
}

class FileExtensionManager : IFileExtensionManager {

    override fun isValid(filename:String?):Boolean{
        filename?:throw IllegalArgumentException("filename has to be provided")
        if(!filename.endsWith(".SLF", true)){
            return false
        }
        return true
    }
}