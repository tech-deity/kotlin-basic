package org.kotlinlang.play         // 1

abstract class calculate {
    
    abstract fun cal(x:Int,y:Int) :Int
    
}

class Add:calculate(){
    
    override fun cal (x:Int,y:Int):Int{
        
        return x+y
    }
}

class Sub:calculate(){
    
    override fun cal (x:Int,y:Int):Int{
        
        return x-y
    }
}

class Multi:calculate(){
    
    override fun cal (x:Int,y:Int):Int{
        
        return x*y
    }
}


fun main(){
    
    val add = Add()
    println("sum ${add.cal(3,2)}")
    
    val sub= Sub()
    println("subtraction ${sub.cal(33,2)}")
    
    val mul=Multi()
    println("multiplication ${mul.cal(33,5)}")
}
