//first program 
package org.kotlinlang.play         // 1

open class Base{
    
    val name :String="rahul"
    constructor(empid:Int){
        
       var id :Int=empid
       println("id of the rahul is $id")
    }
    
}

class child :Base(22){
    
    fun B(){
        
        println(name)//name element from base class
        println("child class")
        
    }
}
fun main()
{
    
    val d= child()
   d.B()
    
}


//second code
package org.kotlinlang.play         // 1

open class Emp(ename:String,eage:Int,esalary:Double){
    
   
   init{
       
        println("my name is $ename my age is $eage  my salary is $esalary")
   }
    
}

class webdeveloper(name:String,age:Int,salary:Double) :Emp(name,age,salary){
    
    fun web(){
        
        
        println("i am website developer")
        
    }
}
class Android(name:String,age:Int,salary:Double):Emp(name,age,salary){
    
    fun android(){
        
        println("I am android developer")
    }
}

class IosDev(name:String,age:Int,salary:Double):Emp(name,age,salary){
    
    fun ios(){
        
        println("i am ios developer")
    }
}
fun main()
{
    
   val w= webdeveloper("vishal",22,13211.22) 
   val a= Android("ravi",34,122332.33)
   val ios=IosDev("raman",33,12321311.3344)
}


//thrid code

package org.kotlinlang.play         // 1

open class Emp(name :String ,age:Int){
    init{
        
        println("my name is $name and age is $age")
    }
}
class ceo(name:String,age:Int,salary:Double):Emp(name,age){
    
    init{
        
        println("salary is $salary")
    }
    
    
}


fun main(){
    
    val c = ceo("vishal",22,12321.22)
}


//fourth 

// the secondary constructor is inherited using the keyword super
package org.kotlinlang.play         // 1
open class Emp{
    
    constructor(name:String,age:Int){
        println("my name is $name")
        println("my age is $age")
        
    }
}
class ceo :Emp{
    
    constructor(name :String , age:Int, salary :Double):super(name,age)
    {
        println("salary is $salary")
    }
}

fun main(){
    
    ceo("vishal",22,1323.22)
}



//fifth

package org.kotlinlang.play         // 1

open class phone(){
    
    var color :String="Rose "
    fun company(name:String)
    {
        println("Company name is $name")
    }
}

class iphone:phone(){
    
    
    fun discolor(){
        
        println("Color is ${super.color}")
   
    super.company("Iphone")
    }
    
   
}

fun main(){
    
    val p =iphone()
    p.discolor()
}
