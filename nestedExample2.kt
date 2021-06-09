package org.kotlinlang.play         // 1

class outerClass{
    
    var outer="Outer Class variable"
    class nestedClass{
        
        var nested="Nested class variable"
        
        fun abc():String{
            
            var ab = "rahul singh"
            
            return ab
        }
        
    }
}

fun main(){
    println(outerClass.nestedClass().abc())
    
}
