class Student(val name :String="student", var  age:Int=99){

    val sName:String
    var sAge:Int
    init{

        if(name=="student"){
            sName="NA"
            sAge=0
        }
        else{
            sName=name.uppercase()
            sAge=age
        }
        println("student name is $sName")
        println("student age is  $sAge")
    }

    }

    fun main() {

        val stu=Student("vishal ",31)
        println(stu)
        val stu2=Student("rahul")
        println(stu2)
        val stu3=Student()
        println(stu3)
        
    }
