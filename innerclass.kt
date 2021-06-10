package org.kotlinlang.play         // 1

class outerClass {
    
    var abc :String ="ravi singh"
    
    inner class InnerClass{
        
        var bcd="is gagoo"
        
        fun inn():String{
            
            var a= bcd+abc
            
            return a
            
        }
    }
}
fun main()
{
    
    //creating object of inner class
   
    var innerObj=outerClass().InnerClass()
    
    println(innerObj.inn())
}
