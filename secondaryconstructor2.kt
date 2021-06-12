//with two constructor 

package org.kotlinlang.play        

class Emp
{
	constructor(empId:Int, empName:String){
    
        var id =empId
        var name =empName
        
        println("employee id is $id")
        println("employee name is $name")
        
        
	}
    
    constructor(empId:Int, empName:String ,empSalary:Double)
    {
        var id=empId
        var name=empName
        var salary=empSalary
        
        println("employee id is $id")
        println("employee name is $name")
        println("employee salary is $salary")
    }
    
}

fun main(){
    
    Emp(22,"vishal")
    Emp(27,"techdeity",780000.025)
}

