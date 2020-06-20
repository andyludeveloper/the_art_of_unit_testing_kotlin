package com.andyludeveloper.aut

class MemCalculator {
    private var sum:Int = 0
    fun add(number:Int){
        sum+=number
    }
    fun sum():Int{
        val temp = sum
        sum = 0
        return temp
    }
}