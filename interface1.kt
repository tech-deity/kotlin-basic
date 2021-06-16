//interface can have both abstract and non abstract FUNCTIONS
//Interace can have only abstract property non abstract property is not allowed
// you cannot create object of inteface because it doesnt have constructor
//A class can implement more then one interface
//abstract properties and abstract member function can be overriden in the classes that implements
package org.kotlinlang.play         // 1


interface myinterface{
  
  var str : String
  fun demo()
  
  fun hello(){
  
  println("hey hello this is interface")
  }
  
       
}

class Myclass:myinterface{
    
    override var str:String="this is property overriden"
    override fun demo(){
        
        println("this is overriden function hello")
    }
}

fun main(){
    
    
    
    val mc =Myclass()
    mc.demo()
    mc.str
    mc.hello()
}

    
