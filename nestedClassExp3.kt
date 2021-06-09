package org.kotlinlang.play         // 1

class outerClass{
    
    var outer="Outer Class variable"
    class nestedClass{
        
        var nested="Nested class variable"
        
        fun nestfunc(str2: String): String {
            var s2 = nested.plus(str2)
            return s2
        } 
    }
}

fun main(){
    
    //accesing nested class element//property from outerclass without creating object
  //  println(outerClass.nestedClass().nestfunc("ravi singh"))
  //  
   var nestobj=outerClass.nestedClass()
  var result=  nestobj.nestfunc(" is accessed by creating object")
  println( result)
    
}
