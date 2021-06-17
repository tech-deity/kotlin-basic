package org.kotlinlang.play         // 1


abstract class Emp(var ename:String,var eid:Int,var eage:Int){
    
    abstract var salary :Double
    
    abstract fun dob(date :String)
    
    fun edetails(){
        println("name is $ename")
        println("id is $eid")
        println("age is $eage")
        
        println("salary is $salary")
    }
}

class Web(name :String,eid:Int,eage:Int) : Emp(name,eid,eage){
    
    
    override var salary =122332.22
    override fun dob(date:String){
        
        println("dob is $date")
    }
}

fun main(){
    val w = Web("ravi",212,22)
    w.edetails()
    w.dob("22 dec 2000")
    
}


open abstract class abc{
    abstract var y :Int
    fun m1(){
        
        println("non abstract function ")
    }
}

class c :abc(){
    override var y : Int=22
    
}


fun main() {                        // 2
      
    
    val obj = c()
    obj.m1()
    println(obj.y)
}
