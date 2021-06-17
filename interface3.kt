package org.kotlinlang.play         // 1
interface parameter{
    val l:Int
    val  b:Int
    
}

interface calc:parameter{
    fun area()
    fun perimeter()
    
}

class xyz:calc{
    
    override val l :Int=33
    override val b:Int=2
    
    override fun area(){
        println("area is ${l*b}")
    }
    override fun perimeter(){
        println("perimeteris ${l+b}")
    }
}

fun main()
{
    val x = xyz()
    x.area()
    x.perimeter()
}
