package org.kotlinlang.play         // 1

data class Student(val name:String, val age:Int)

fun main()
{
        val stu = Student("Chaitanya", 31)
    val stu2 = Student("Chaitanya", 31)
    val stu3 = Student("Ajeet", 30)

    if(stu.equals(stu2)==true)
    
        println("both are equal ")
    else
        print("not equal")
    
    
    if(stu2.equals(stu3)==true)
    
        println("stu2 t equal to stu3")
    
    else
        
        println("not equal")
    
    println("hashcode of su : ${stu.hashCode()}")
    println("hashcode of su : ${stu2.hashCode()}")
    println("hashcode of su : ${stu3.hashCode()}")
    
}
