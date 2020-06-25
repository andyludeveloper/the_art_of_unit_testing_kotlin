package com.andyludeveloper.aut

class ExtensionManagerFactory {
    companion object{
        var manager: IExtensionManager = FileExtensionManager()
    }
}