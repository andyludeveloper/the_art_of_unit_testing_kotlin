package com.andyludeveloper.aut

class LogAnalyzer {
    var manager:IExtensionManager
    constructor(manager: IExtensionManager){
        this.manager = manager
    }

    constructor(){
        this.manager = FileExtensionManager()
    }

    fun isValidLogFileName(filename:String?):Boolean{
        return manager.isValid(filename)
    }

}