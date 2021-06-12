package org.kotlinlang.play         // 1

class Emp(emp_id:Int=10,emp_name:String="ravi")
{
  
  val id :Int
  val name:String
  init{
    
    id=emp_id
    name=emp_name
      
      println("employee id is $id")
      println("employee name is $name ")
         
  }
  
  
}

fun main()
{
    
    val emp1 = Emp(11,"rahul")
    val emp2 = Emp(1122)
    val emp3= Emp()
}

