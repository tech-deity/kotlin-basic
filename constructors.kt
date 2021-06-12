//there are two types of constructors when it comes for kotlin primary and secondary 
//primary constructor
// A kotlin class can have at most one primary constructor ... primary constructor cant contain any code  it need initializer block or init{}


// synatax of primary constructor 
class Add Constructor(a:Int, b:Int)
{
  
  
}
//primary constructor with initialzer block


class Emp(emp_id :Int , emp_name:String)
{
  val id :Int
  val name:String
  
  init{
    
    id=emp_id
    name=emp_name
  }
  
  println("employee Id : $id")
  println(" employee name :$name")
}

fun main(){
  
  val emp = Emp(111,"ravi")
  
  
}

          
  

