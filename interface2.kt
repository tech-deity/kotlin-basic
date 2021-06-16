package org.kotlinlang.play         // 1


interface myinterface{
  
  var str : String
  fun demo()
  
  fun hello(){
  
  println("hey hello this is interface")
  }
  
       
}


interface x{
    
    var str1 : String
    fun demo1()
    fun hello1(){
        println("hey hello this is interface x")
    }
}
class Myclass:myinterface,x{
    
    override var str:String="this is property overriden"
    override var str1:String="this is property of X interface"
    override fun demo(){
        
        println("this is overriden function hello")
    }
    
    override fun demo1(){
        
        
        println("this is overriden function demoX")
    }
}

fun main(){
    
    
    
    val mc =Myclass()
    mc.demo()
    mc.str
    mc.hello()
    mc.demo1()
    mc.str1
    mc.hello1()
}

    package org.kotlinlang.play         // 1


interface myinterface{
  
  var str : String
  fun demo()
  
  fun hello(){
  
  println("hey hello this is interface")
  }
  
       
}


interface x{
    
    var str1 : String
    fun demo1()
    fun hello1(){
        println("hey hello this is interface x")
    }
}
class Myclass:myinterface,x{
    
    override var str:String="this is property overriden"
    override var str1:String="this is property of X interface"
    override fun demo(){
        
        println("this is overriden function hello")
    }
    
    override fun demo1(){
        
        
        println("this is overriden function demoX")
    }
}

fun main(){
    
    
    
    val mc =Myclass()
    mc.demo()
    mc.str
    mc.hello()
    mc.demo1()
    mc.str1
    mc.hello1()
}

    
