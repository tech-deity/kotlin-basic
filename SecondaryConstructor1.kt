//kotlin can have one or more secondary constructor 
//secondary constructor allows to provide initialisation and logic to the variables 


package org.kotlinlang.play         // 1

class Add
{
	constructor(a:Int,b:Int){
    
    var c=a+b
        
    println("sum is $c")
    
}
    
}

fun main(){
    
    Add(22,3)
}

