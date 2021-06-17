package org.kotlinlang.play         // 1

open class abc{
    
    open fun breath(){
        println("every living being breath")
    }
}

abstract class Animal :abc(){
    override abstract fun breath()
}
class  Dog:Animal(){
    
    override fun breath(){
        println("dogs are animal and they breath")
    }
}


fun main(){
    
    val it = abc()
    it.breath()
    
    val d =Dog()
    d.breath()
    
}
