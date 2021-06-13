//we can call another secondary constructor within the other using this() 

class Add{
  
  constructor(a:Int,b:Int) :this(a,b,19)
  {
    
    var c=a+b
    println("Sum of the two is $c)
            
    
  }
  constructor(a:Int,b:Int,c:Int)
    {
      
      var d=a+b+c
      
      println("sum of the three is $d)
              
              }
}

fun main()
              {
                Add(12,33)
                
              }
              
