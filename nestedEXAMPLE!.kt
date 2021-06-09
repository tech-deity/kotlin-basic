package org.kotlinlang.play         // 1

class outerClass{
    
    var outer="Outer Class variable"
    class nestedClass{
        
        var nested="Nested class variable"
        
    }
}

fun main(){
    
    //accesing nested class element//property from outerclass without creating object
    println(outerClass.nestedClass().nested)
}
