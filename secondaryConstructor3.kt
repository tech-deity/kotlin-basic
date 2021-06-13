package org.kotlinlang.play         // 1

class Add{
    
   constructor(a:Int, b:Int){
       
       var c = a+b
       println("sum of two is $c")
   }
   
   constructor(a:Int, b:Int,c:Int){
       
       var d = a+b+c
       println("sum of two is $d")
   }
   
   constructor(a:Int, b:Int ,c:Int,d:Int){
       
       var e = a+b+c+d
       println("sum of two is $e")
   }
   
}

fun main(){
    
    Add(22,3)
    Add(33,22,44)
    Add(12,13,54,66)
}
