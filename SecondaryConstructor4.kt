// we call secondary consructor of parent class from child class using super()keyword

package org.kotlinlang.play         // 1

open class Parent{
    
    constructor(pname:String,pid:Int,psalary:Double)
    {
        
        var name:String=pname
        var id:Int=pid
        var salary:Double=psalary
        println("name is $name")
        println("salary is $salary")
        println("id is $id")
        
    }
    
}
    class Child: Parent{
        
        constructor(cname:String, cclass:Int) : super(cname,cclass,664236.22){
            
            var name:String=cname
            var clas:Int=cclass
            println("child name is $name")
            println("child class is $clas")
        }
    }
    
    
    

fun main(){
   
    Child("vishal",33)
    }
