package com.alliconsulting.SimpleIJKotlinApp

class Fib() {
    val fibSum = 0
    fun doFib(argNum: Int): Int{
        if(argNum<2)
            return argNum
        else
            return doFib(argNum-1) + doFib(argNum-2)
    }
}
