class Student {

    constructor(name:String ,age:Int)
    {
        println("Student name is ${name.uppercase()}")
        println("student age is $age")

    }
    
}
 
 fun main(){

     val obj = Student("vishal",27)

     println(obj)
 }